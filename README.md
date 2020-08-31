# Simple Paranthesis Validation

6 unique LISP code examples (2 valid, 2 with an extra opening paranthesis, and 2 with an extra closing) feed unit tests that operate on the static ParanthesisValidator function .validate(File file). Implementing using a queue to keep track of opened and closed paranthesis; opening pushes an item to the stack, closing pops. If an EmptyStackException is thrown, validation fails. And if the stack is not empty at the end of the file, validation fails.


## Installation

Clone the repository and import 'an existing maven project' into your favorite IDE.
```
git clone https://github.com/Dean904/paranthesis_validation.git
```
[MIT](https://choosealicense.com/licenses/mit/)