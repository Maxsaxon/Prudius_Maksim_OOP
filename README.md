# Prudius_Maksim_OOP

UML діаграма до виконаних практикумів
+-----------------------+              +--------+
|         Animal        |<-------------|   Dog  |
+-----------------------+              +--------+
|   - name: String      |              | - breed: String
|   - age: int          |              | - isTrained: boolean
+-----------------------+              +--------+
| + Animal(name: String,|              | + Dog(name: String, age: int, breed: String, isTrained: boolean)
|          age: int)    |              | + getBreed(): String
| + getName(): String   |              | + isTrained(): boolean
| + getAge(): int       |              | + setTrained(isTrained: boolean): void
| + bark(): void        |              | + bark(): void
+-----------------------+              | + equals(o: Object): boolean
                                        | + clone(): Dog
                                        | + toString(): String
