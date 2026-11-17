# Banking App

A Java banking application project organized around customers, bank accounts, and transactions. The source tree includes model classes for checking and savings accounts, repositories for customer, account, and transaction data, and services for account operations, banking workflows, and transfers. Banking-specific exceptions are also part of the project structure.

The project is currently a scaffold: these classes are placeholders, and the application entry point does not yet implement banking workflows.

## Build

The Maven project is in `fin-bank/` and targets Java 27. From that directory, compile the project with:

```sh
mvn compile
```

Or run the same command from the repository root with:

```sh
mvn -f fin-bank/pom.xml compile
```
