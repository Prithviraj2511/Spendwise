![banner](./Images/spendwiseBanner.png)

## Spendwise App Overview

### Functional Requirements -
- User should be able to sign in and sign up
- User is able to add or remove the expense manually
- User is able to see his expenses and catagorised expenses
- User is able to see report and statastics about the spendings

### Non Functional Requirements -
- Fault taolerant
- Scalable
- Latency < 100ms
- external configurations to accomodate less code changes

### Future scope -
- User can ask for tips to improve his/her financial spending behaviour
- Parse user SMS if user have provided required permissions to automatically add the expenses

## Tools & Technologies Used
<p align="left"> 
<a href="https://redis.io" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/Prithviraj2511/prithviraj-patil/refs/heads/main/public/images/redis_word.svg" alt="redis" width="60" height="40"/> </a> 
&nbsp;
<a href="https://redis.io" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/Prithviraj2511/prithviraj-patil/refs/heads/main/public/images/rabbitMq_word.svg" alt="rabbitMq" width="80" height="40"/> </a> 
&nbsp;
<a href="https://redis.io" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/Prithviraj2511/prithviraj-patil/refs/heads/main/public/images/docker_word.svg" alt="rabbitMq" width="80" height="40"/> </a> 
&nbsp;
<a href="https://kafka.apache.org/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/Prithviraj2511/prithviraj-patil/refs/heads/main/public/images/kafka_word.svg" alt="kafka" height="40"/> </a> 
&nbsp;
<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/Prithviraj2511/prithviraj-patil/refs/heads/main/public/images/Kong_word_dark.svg" width="60" height="40">
  <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/Prithviraj2511/prithviraj-patil/refs/heads/main/public/images/Kong_word_white.svg" width="60">
  <img alt="kong image" src="https://raw.githubusercontent.com/Prithviraj2511/prithviraj-patil/refs/heads/main/public/images/Kong_word_white.svg" width="60">
</picture>
</p>

## UML Designs

### Auth Service UML
![](./Images/authService_UML.png)