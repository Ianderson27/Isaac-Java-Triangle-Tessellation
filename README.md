# triangle_tessellation_java

Starter code for intro to GitHub lessons — Java / JavaFX version.

Practice making contributions to code hosted by another user.

Here you will make contributions to the code in the following way:

"Fork" the repository. This makes a copy of the repository with you as the owner. It is linked to the
original, in that changes made can be pulled by the original owner.

Create changes to your code to add in your triangles. Test out the code, then copy your edits to the
`Tessellation.java` file that is in the repository.

Commit your changes. Write an appropriate commit message to describe them.

Create a pull request. This gives the original owner the opportunity to merge your changes with the
original.

The original owner will merge your changes, adding them to the code and combining with other
contributors' work. :)

Here is the image that we will be creating. Decide with your classmates which color triangles you will
produce.

<img width="608" height="404" alt="image" src="https://github.com/user-attachments/assets/cafe99a0-8a09-48fc-9f11-333f65277e41" />


## The Files

This repository contains two Java files:

- `SimpleGraphics.java` — the drawing library. You shouldn't need to edit this file for this task.
- `Tessellation.java` — where you'll add your code. Only the RED triangles are filled in; the other five colors
  are left as empty comment stubs for you and your classmates to fill in. This is what you start with.
<img width="604" height="430" alt="image" src="https://github.com/user-attachments/assets/6d6116cd-c235-4eca-a198-2b1a6b42ee8b" />


## Making Your Changes

Open `Tessellation.java` and find the comment for your assigned color, e.g.:

```java
// code for BLUE triangles
```

Underneath it, add a loop similar to the one already written for red, calling
`SimpleGraphics.fillTriangle(x1, y1, x2, y2, x3, y3)` with your triangle's corner points. Set your
color first with `SimpleGraphics.setFillColor(...)`.

## Running Your Code

This project uses the Gradle wrapper, so you don't need to install anything extra. From a terminal in the
project's root folder (the one with the `gradlew` file):

```bash
./gradlew run
```

This compiles your code and opens a window showing your picture. If something seems off or the build
starts acting strange, try:

```bash
./gradlew clean
./gradlew build
```

first, then `./gradlew run` again.

## Contributing Your Work

1. Fork this repository.
2. Clone your fork and add your triangles to `Picture.java` as described above.
3. Run your code with `./gradlew run` and check it against the target image.
4. Commit your changes with a clear message describing what you added.
5. Push your commit and open a pull request back into this repository.
6. Once your pull request (and everyone else's) is merged, sync your fork to see the finished picture.
