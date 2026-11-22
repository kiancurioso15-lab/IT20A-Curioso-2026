Java OOP Activities

1. Musical Instrument Program

What the Program Does?

The program shows the different sounds produced by musical instruments.

It contains four classes:

- **MusicalInstrument** – Parent class.
- **Guitar** – Produces strumming sounds.
- **Piano** – Produces melodies.
- **Drum** – Produces rhythmic beats.
- **PolymorphismDemo** – Runs the program.

2. Polymorphism

Polymorphism means one method can have different behaviors.

In this program:

- **Parent Class:** MusicalInstrument
- **Child Classes:** Guitar, Piano, and Drum
- **Overridden Method:** play()

Each instrument has its own version of the `play()` method.

3. Abstraction

Abstraction means hiding details and showing only important parts.

To apply abstraction to this program:

- **Abstract Class:** MusicalInstrument
- **Abstract Method:** play()
- **Implementation:** Guitar, Piano, and Drum provide their own `play()` methods.

**Note:** The original MusicalInstrument program does not use abstraction yet.

---

4. AbstractionDemo Program

What the Program Does

The program shows how different animals make sounds.

It contains three classes:

- **Animal** – Abstract parent class.
- **Dog** – Makes a barking sound.
- **Cat** – Makes a meowing sound.

How Abstraction Works

- **Abstract Class:** Animal
- **Abstract Method:** makeSound()
- **Regular Method:** eat()
- **Child Classes:** Dog and Cat

The Dog and Cat classes provide their own implementation of the `makeSound()` method.

5. Difference Between Polymorphism and Abstraction

- **Polymorphism:** One method can have different behaviors.
- **Abstraction:** Hides unnecessary details and shows important information.