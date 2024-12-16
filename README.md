![microservice-app](https://socialify.git.ci/david11yf29/microservice-app/image?forks=1&issues=1&language=1&name=1&owner=1&pulls=1&stargazers=1&theme=Light)

# microservice-app
一個使用 Spring Boot 框架的下單 App，用於下單和發送通知。

Discovery Server(:8761) - Eureka Server
Production Service(:8080), Inventory Service(:8082)
Order Service(:8081) - Kafka
ApiGateway(:8083)
Notification Service(:8084) - Kafka
Prometheus(:9090) + Grafana(:3000) - Monitor Health
Key-cloak(:8181) - Token Authentication

## 目錄
- [功能](#功能)
- [使用方法](#使用方法)
- [技術細節](#技術細節)
- [示例](#示例)
- [授權](#授權)

## 功能
- 提供 RESTful API
- 使用 Kafka 推送下單成功訊息
- 使用 Grafana 視圖化流量數據

## 使用方法
使用 Postman 測試系統：
 - 加入新產品至資料庫：`POST http://localhost:8083/api/product`
 - 查詢產品清單：`GET http://localhost:8083/api/product`
 - 提交訂單：`POST http://localhost:8083/api/order`
 - 確認 App 各微服務狀態：`http://localhost:8761`
 - 使用 Grafana 進行數據提取和數據可視化：`http://localhost:3000`
  
## 技術細節
- **後端**：Spring Boot, API Gateway, Eureka, Kafka, Docker, Prometheus, Grafana
- **資料庫**：MySQL, MongoDB

## 示例
![c1abcca3-a392-450a-85ef-6d5cb824d7fa](https://github.com/user-attachments/assets/f5830e9b-4853-46cc-9965-3800c60a156e)
![11930fb9-5025-4285-b4db-182dee1e7080](https://github.com/user-attachments/assets/2737d877-9ef8-4b62-894d-9c0cfdfb13d9)
![fd88c994-9968-4c4e-9eb0-cc44d07b6c01](https://github.com/user-attachments/assets/e1d0d514-b1db-4f37-ad09-715bbddc40a9)
![5a5f3e2d-9f0d-4398-8963-90770aa0758a](https://github.com/user-attachments/assets/0709034b-0c52-4b60-b985-e8497c9cb6a4)

## 授權
本項目基於 [MIT License](LICENSE) 許可使用。




