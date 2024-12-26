# Chatbot Project

## Overview
This project implements a simple chatbot using a client-server architecture. The server listens for incoming connections from clients and processes messages, while the client allows users to send messages and receive responses in real-time.

## Features
- **Real-time communication**: Clients can send messages to the server and receive responses instantly.
- **Simple command handling**: The server can respond to user messages and recognize a "bye" command to terminate the chat.
- **UTF-8 Encoding**: Ensures proper handling of string data during transmission.

## Technologies Used
- **Java**: The programming language used for both client and server implementations.
- **Socket Programming**: For establishing communication between the client and server.
- **Data Streams**: For sending and receiving data over the network.

## Architecture
The architecture consists of two main components:
- **Server**: Listens for incoming client connections and handles message processing.
- **Client**: Connects to the server, sends messages, and displays server responses.


## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your machine.
- Basic knowledge of Java programming and command line usage.

### Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/AbdisaGebi/chatbot-project.git
   cd chatbot-project
