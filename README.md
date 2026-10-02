# 🔎 Java Mini Search Engine

A console-based mini search engine built with Java to practice
Data Structures, Algorithms, and real-world Java development.

## 🚀 Features

- 📄 Read text documents from files
- 🧹 Clean and normalize text
- 🔍 Search documents using an Inverted Index
- 📊 Rank search results
- ⚡ Top-K results using PriorityQueue
- 🌳 Autocomplete using Trie
- 🧱 Object-Oriented Java structure

## 🧠 Data Structures Used

- HashMap
- HashSet
- PriorityQueue / Min Heap
- Trie

## 📁 Project Structure

MiniSearchEngine/
│
├── src/
│   ├── Main.java
│   ├── Document.java
│   ├── FileReaderUtil.java
│   ├── TextCleaner.java
│   ├── InvertedIndex.java
│   ├── SearchEngine.java
│   ├── SearchResult.java
│   ├── TopKResults.java
│   └── Trie.java
│
├── data/
│   ├── java.txt
│   ├── dsa.txt
│   └── spring.txt
│
└── README.md

## ▶️ How to Run

Compile:

javac src\FileReaderUtil.java src\TextCleaner.java src\InvertedIndex.java src\SearchEngine.java src\SearchResult.java src\Trie.java src\Main.java

Run:

java -cp src Main

## 💡 Example

Enter search word: java

Autocomplete:
java
javascript

Results:
Document 1 → Score 1
Document 3 → Score 1

## 🎯 What I Learned

This project helped me connect Java DSA concepts with a
practical application.

I practiced:

- HashMap-based indexing
- HashSet for document tracking
- Heap-based Top-K processing
- Trie-based autocomplete
- File handling
- String processing
- Object-Oriented Programming
- Java project organization

## 🔮 Future Improvements

- Better search ranking
- Phrase search
- Web interface using Spring Boot
- PostgreSQL database
- React frontend
- AI-powered semantic search
- RAG-based document search

## 👨‍💻 Author

Umapathi D