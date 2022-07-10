# TodoList
- **目的:**

    以Spring Boot 三層式架構Controller -> Service -> DAO -> DB的方式來實做待辦清單。

    Controller : 接收前端的請求交由Service處理，處理完後再回傳給Controller。

    Service : 根據Controller的請求做資料處理以及處理由DAO回傳的資料。

    DAO : 對資料庫進行CRUD操作。




- **使用工具 :** https://start.spring.io/

    Spring Boot DevTools, Lombok, Spring Web, Spring Data JPA, H2 Database





- **使用方式:**

    執行TodolistApplication.java
    
    輸入網址:http://localhost:9100/h2-console

    登入資料庫後以SQL格式輸入待辦事項，格式: INSERT INTO TODO(TASK, STATUS) VALUES("待辦事項", 1); //(1表示未完成,2表示已完成)

    http://localhost:9100/todos

    以JSON格式列出待辦清單
