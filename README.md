# design_patterns

### SOLID Principles

**Single Responsibility Principle:**

Every class should implement single functionality , it should not implement multiple functionalities.

e.g.

**Account** class is a POJO and responsible only for **storing account details**.

**AccountOperations** class is responsible for **handling account related operations** like adding account, updating account and retrieving account details.

**TransactionOperations** class is responsible for **handling transactions like deposit and withdrawal** .
