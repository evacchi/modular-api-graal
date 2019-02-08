# Example

Demo of a modular project with API separate from implementations, 
with optional dependencies and static wiring.

Bonus: `mvn package` creates a native image in `examples/target` (courtesy of the
SubstrateVM Maven plugin) if `JAVA_HOME` points to GraalVM.

- `api`: interfaces
- `core`: core implementations
- `extras`: optional implementations
- `bundle`: static factories for wiring
- `examples`: an example depending on `bundle` (`core`, `api`), 
  but not `extras`: although there is only **one** 
  factory class exposing all the services defined in `api`, 
  the Example does not break unless the missing class is explicitly requested.