{
  description = "rust env";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";

    devshell = {
      url = "github:numtide/devshell";
      inputs.nixpkgs.follows = "nixpkgs";
    };

    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = inputs:
    with inputs;
      flake-utils.lib.eachDefaultSystem (
        system: let
          pkgs = import nixpkgs {
            inherit system;
            overlays = [
              devshell.overlays.default
            ];
          };
        in {
          devShells.default = pkgs.devshell.mkShell {
            name = "java project";

            packages = with pkgs; [
              jdk17
              maven
              (jdt-language-server.overrideAttrs (oa: {
                version = "";
                timestamp = "";
                src = fetchurl {
                  url = "https://download.eclipse.org/jdtls/snapshots/jdt-language-server-latest.tar.gz";
                  sha256 = "sha256-3ODPq/LUrzhi+vbjWJ9usqITPW4BU9w9VPVOktv79q4=";
                };
              }))
            ];

            env = [
            ];
          };
        }
      );
}
