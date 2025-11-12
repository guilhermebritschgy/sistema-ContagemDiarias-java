# 🏨 Daily Rate Calculation System (Java)

## 📌 Description
This project is a simple **Java console application** that calculates the total cost of a hotel stay based on:
- The type of accommodation  
- The number of nights  
- The payment method  

It was developed to practice **programming logic**, **input validation**, and **modularization using functions**.

---

## 🧠 Features
✅ Requests user input for guest name, room type, and number of nights.  
✅ Calculates the total value according to the selected room type:
```
1️⃣ Standard → R$380 per day  
2️⃣ Luxury → R$450 per day  
3️⃣ Super Luxury → R$560 per day
```
✅ Applies a 10% discount for cash payments (V).  
✅ Handles incorrect inputs through validation loops to ensure reliability.

## 🧰 Technologies Used

**Language:** Java  
**IDE (optional):** IntelliJ IDEA / Eclipse / VS Code  
**Concepts:** Functions, loops, conditional structures, and user input (Scanner class)


## ⚙️ How to Run

Follow these steps to run the project locally 👇

# 1. Clone this repository
git clone https://github.com/guilhermebritschgy/sistema-ContagemDiarias-java.git

# 2. Open the project in your preferred IDE

# 3. Compile and run the program
````
javac ContagemDiarias.java
java ContagemDiarias
````
## 💡 Example of Execution

Below is an example of how the program works in the console:
````
Qual seu nome:
Guilherme
Qual o tipo de acomodação (1-Stantard, 2-Luxo, 3-Super Luxo):
2
Digite a quantidade de diarias?
3
Valor Total: 1350.0
Digite a forma de pagamento (V - à vista, P - parcelado)
V
Valor total: 1215.0
