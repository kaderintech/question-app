﻿# QuestApp REST API Documentation

This document provides detailed information about the REST API endpoints of QuestApp, which is a question application built using `Java Spring Boot`, `MySQL`, and `JWT` authentication.

## Authentication Endpoints

### Login
- Path: /auth/login
- Method: POST
- Description: Authenticates a user and returns an access token along with a refresh token.
- Request Body:
```
{
  "userName": "string",
  "password": "string"
}
```
- Response:
```
{
  "accessToken": "string",
  "refreshToken": "string",
  "userId": "long"
}
```
### Register:
- Path: /auth/register
- Method: POST
- Description: Registers a new user and returns an access token along with a refresh token.
- Request Body:
```
{
  "userName": "string",
  "password": "string"
}
```
- Response:
```
{
  "accessToken": "string",
  "refreshToken": "string",
  "userId": "long"
}
```
### Refresh Token
- Path: /auth/refresh
- Method: POST
- Description: Refreshes the access token using a valid refresh token.
- Request Body:
```
{
  "userId": "long",
  "refreshToken": "string"
}
```
- Response:
```
{
  "accessToken": "string",
  "userId": "long"
}
```
## Post Endpoints
### Get All Posts
- Path: /posts
- Method: GET
- Description: Retrieves all posts.
- Query Parameters:
-- userId (optional): Filter posts by user ID.
- Response: List of PostResponse objects.
### Create Post
- Path: /posts
- Method: POST
- Description: Creates a new post.
- Request Body: PostCreateRequest object.
- Response: Created Post object.
### Get One Post
- Path: /posts/{postId}
- Method: GET
- Description: Retrieves a single post by ID.
- Response: PostResponse object.
### Update Post
- Path: /posts/{postId}
- Method: PUT
- Description: Updates an existing post by ID.
- Request Body: PostUpdateRequest object.
- Response: Updated Post object.
### Delete Post
- Path: /posts/{postId}
- Method: DELETE
- Description: Deletes a post by ID
## Comment Endpoints
### Get All Comments
- Path: /comments
- Method: GET
- Description: Retrieves all comments. Optionally, it can be filtered by user ID or post ID.
### Create Comment
- Path: /comments
- Method: POST
- Description: Creates a new comment.
### Get One Comment
- Path: /comments/{commentId}
- Method: GET
- Description: Retrieves a single comment by its ID.
### Update Comment
- Path: /comments/{commentId}
- Method: PUT
- Description: Updates an existing comment by its ID.
### Delete Comment
- Path: /comments/{commentId}
- Method: DELETE
- Description: Deletes a comment by its ID.
## Like Endpoints
### Get All Likes
- Path: /likes
- Method: GET
- Description: Retrieves all likes. Optionally, it can be filtered by user ID or post ID.
### Create Like
- Path: /likes
- Method: POST
- Description: Creates a new like.
### Get One Like
- Path: /likes/{likeId}
- Method: GET
- Description: Retrieves a single like by its ID.
### Delete Like
- Path: /likes/{likeId}
- Method: DELETE
- Description: Deletes a like by its ID.
## User Endpoints
### Get All Users
- Path: /users
- Method: GET
- Description: Retrieves all users.
### Create User
- Path: /users
- Method: POST
- Description: Creates a new user.
### Get One User
- Path: /users/{userId}
- Method: GET
- Description: Retrieves a single user by their ID.
### Update User
- Path: /users/{userId}
- Method: PUT
- Description: Updates an existing user by their ID.
### Delete User
- Path: /users/{userId}
- Method: DELETE
- Description: Deletes a user by their ID.
