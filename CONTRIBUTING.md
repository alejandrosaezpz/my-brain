# Contributing

Thanks for helping improve this repository.

## How to add a new topic

1. Add the topic doc in `docs/` using the next number.
2. Follow the standard structure from `templates/DOC_TEMPLATE.md`.
3. Add any topic exercises in `problems/`.
4. Add or update Java code in `src/main/java/`.
5. Add or update tests in `src/test/java/`.
6. Update `README.md` and the canonical lowercase `roadmap.md`.

## How to add a new problem

1. Create a Markdown explanation under `problems/`.
2. Add the Java solution in the matching package.
3. Add a JUnit 5 test class.
4. Keep the solution simple and interview-friendly.
5. Include complexity and edge cases.

## How to add tests

- Put tests under `src/test/java/`.
- Mirror the main package structure.
- Use clear test names.
- Cover normal cases and edge cases.
- Keep tests short and readable.

## How to run tests

```bash
mvn test
```

## How to update README and roadmap

- Mark completed topics clearly.
- Update counts for implemented problems.
- Keep statuses consistent with the actual codebase.
- Update the lowercase `roadmap.md` after every meaningful milestone.

## Pull request checklist

- [ ] code compiles
- [ ] tests pass
- [ ] problem explanation is original
- [ ] complexity is documented
- [ ] README is updated
- [ ] roadmap is updated
- [ ] formatting is clean
- [ ] no copied external statements
