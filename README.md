
# Number Guessing Game

## Description
The **Number Guessing Game** is a simple Java console application where players guess a randomly generated number based on their selected difficulty level. The game provides feedback to guide the player in guessing the correct number. Players can play multiple rounds or exit the game.

## Features
- Three difficulty levels:
  - **Easy**: Guess a number between 1 and 10.
  - **Medium**: Guess a number between 1 and 100.
  - **Hard**: Guess a number between 1 and 1000.
- Random number generation for each game.
- Feedback after each guess:
  - "Try Lower" if the guess is too high.
  - "Try Higher" if the guess is too low.
- Option to replay or exit the game after each round.

## How to Run

1. Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk-downloads.html) installed on your computer.
2. Clone or download this repository.
3. Open a terminal or command prompt and navigate to the directory containing the `Numberguess.java` file.
4. Compile the program using the following command:
   ```bash
   javac Numberguess.java
   ```
5. Run the program with:
   ```bash
   java Numberguess
   ```

## Gameplay Instructions
1. Choose a difficulty level:
   - Enter `1` for Easy.
   - Enter `2` for Medium.
   - Enter `3` for Hard.
2. Start guessing the number based on the provided range.
3. Follow the hints ("Try Higher" or "Try Lower") to find the correct number.
4. Once you guess correctly, you can choose to play again or exit the game by typing:
   - `start` to play another round.
   - `exit` to quit the game.

## Example Gameplay
```
Choose The Difficulty:
Enter 1 For Easy (Number 1-10)
Enter 2 For Medium (Number 1-100)
Enter 3 For Hard (Number 1-1000)
1
Guess The Number Between 1 and 10:
5
Try Higher
7
Try Lower
6
Wow... Your Guess Is Correct!
Type 'start' To Play Again or 'exit' To Quit:
exit
Thank you for playing!
```

## Contributing
Contributions are welcome! If you'd like to improve this project, feel free to fork the repository and submit a pull request.
