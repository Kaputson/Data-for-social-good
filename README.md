# Unit 2 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to the user. Each user has different needs based on the information they are looking for from data. Your goal was to create a data analysis program for your user that stores and analyzes data to provide the information they need

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- Write a class – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- Create at least two 1D arrays – Create at least two 1D arrays to store the data that your user needs information about.
- Write a method – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- Implement a toString() method – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- Document your code – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story

Include your User Story you analyzed for your project here. Your User Story should have the following format

>As a movie enthusiast, I want to make a list a of good movies so I can watch them with my friends

## Dataset

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type.

Dataset: https://www.kaggle.com/datasets/alessandrolobello the-ultimate-film-statistics-dataset-for-ml

- **title** (String) - name of movie
- **genre** (String) - type of movie
- **director**(String) - who it was directed by
- **movie rating** (double) - how well it was rated

## UML Diagram

Put an image of your UML diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file is one work, otherwise it might not get properly displayed on this README

![UML Diagram for my project](<img width="262" height="227" alt="Screenshot 2025-12-10 7 42 14 PM" src="https://github.com/user-attachments/assets/046940b1-6ade-437a-8616-3feef3861e57" />.png)

## Description 

Write a description of your project here. In your desription, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project

My user story was to make a list so I can find movies and share the list with friends, using data found form kaggle I was able to make code that traverses through the data finding specific pieces of it and turning it into a toString() where it prints out the title, genre, director and the rating, all of these pieces of data were turned into arrays full of information and I used FileReader methods to analyze them. This dataset was essential because it gives the most necesarry pieces of information about movies you'd want to watch including how well or terribly they were rated. The user will interact by choosing how they want to seracmh through the data, by title, by genre, or by director. Next, they will input the name of a movie, genre, or director and it will print out movies based on what they inputted. they can keep searching if they'd like or just end the program from there.
