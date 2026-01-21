TIC TAC TOE GAME (JAVA)
PROJECT DESCRIPTION

This project is a command-line based Tic Tac Toe game developed using Java.
It allows two players to play against each other on a 3x3 grid.
The game alternates turns between players, validates user input, displays the board after each move, and determines the winner or a draw.
This project was developed as part of an academic assignment.

TECHNOLOGIES USED

Java (JDK 17 / JDK 23)

Visual Studio Code

Command Line Interface

FEATURES

3x3 Tic Tac Toe board

Two-player gameplay (Player X and Player O)

Input validation for row and column values

Prevents placing a mark in an occupied cell

Displays the board after every move

Checks for winning conditions

Detects draw condition

Option to replay the game

HOW TO RUN THE PROGRAM
STEP 1: CLONE OR DOWNLOAD THE REPOSITORY

git clone <repository-link>
Or download the ZIP file and extract it.

STEP 2: COMPILE THE PROGRAM

javac TicTacToe.java

STEP 3: RUN THE PROGRAM

java TicTacToe

HOW TO PLAY

The game is played on a 3x3 grid.

Player X starts the game.

Player O plays next.

Enter the row and column numbers (0 to 2) when prompted.

Example input: 1 2

The first player to get three marks in a row, column, or diagonal wins.

If all cells are filled and no player wins, the game ends in a draw.

Players can choose to play again after the game ends.

PROJECT STRUCTURE

TicTacToe/
├── TicTacToe.java
└── README.md

SAMPLE OUTPUT

Welcome to Tic Tac Toe
How to Play:

The game is played on a 3x3 grid.

Player X goes first, followed by Player O.
Player X, enter your move (row column):
0 0
