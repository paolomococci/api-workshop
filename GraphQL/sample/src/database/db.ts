export interface IUser {
  id: string;
  name: string;
  email: string;
  age?: number;
}

export interface IUserUpdate {
  name?: string;
  email?: string;
  age?: number;
}

export interface IPost {
  id: string;
  title: string;
  body: string;
  published: boolean;
  author?: string;
}

export interface IPostUpdate {
  title?: string;
  body?: string;
  published?: boolean;
}

export interface IComment {
  id: string;
  text: string;
  author: string;
  post: string;
}

export interface ICommentUpdate {
  text?: string;
  author?: string;
  post?: string;
}

let users: IUser[] = [
  {
    id: "965321",
    name: "James Doe",
    email: "jamesdoe@example.local",
    age: 28,
  },
  {
    id: "975214",
    name: "Hannah Doe",
    email: "hannahdoe@example.local",
    age: 27,
  },
  {
    id: "895623",
    name: "Sheila Doe",
    email: "sheiladoe@example.local",
    age: 29,
  },
]

let posts: IPost[] = [
  {
    id: "102504",
    title: "some title 102504",
    body: "body of 102504",
    published: true,
    author: "895623",
  },
  {
    id: "103056",
    title: "some title 103056",
    body: "body of 103056",
    published: false,
    author: "975214",
  },
  {
    id: "102001",
    title: "some title 102001",
    body: "body of 102001",
    published: true,
    author: "895623",
  },
  {
    id: "102444",
    title: "some title 102444",
    body: "body of 102444",
    published: false,
    author: "965321",
  },
]

let comments: IComment[] = [
  {
    id: "405001",
    text: "text of comment 405001",
    author: "895623",
    post: "102504",
  },
  {
    id: "405002",
    text: "text of comment 405002",
    author: "975214",
    post: "103056",
  },
  {
    id: "405003",
    text: "text of comment 405003",
    author: "895623",
    post: "102504",
  },
  {
    id: "405004",
    text: "text of comment 405004",
    author: "895623",
    post: "102001",
  },
  {
    id: "405005",
    text: "text of comment 405005",
    author: "965321",
    post: "102444",
  }
]

export default {
  users,
  posts,
  comments
}
