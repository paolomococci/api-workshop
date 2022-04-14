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
