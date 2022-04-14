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

export interface IPost {}

export interface IPostUpdate {}

export interface IComment {}

export interface ICommentUpdate {}
