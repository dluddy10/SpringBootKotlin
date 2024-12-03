package com.example.springbootkotlin

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>
