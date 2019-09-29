export interface Profile {
    username: string;
    bio?: string;
    image?: string;
    following: boolean;
}

export interface User {
    email: string;
    token: string;
    username: string;
    bio?: string;
    image?: string;
}

export interface UserSubmit {
    email: string;
    password: string;
}
export interface UserResponse {
    user: User
}

export interface BookResponse {
    _embedded: Embedded;
    _links: Links;
    page: Page;
}
export interface Embedded {
    books?: (BooksEntity)[] | null;
}
export interface BooksEntity {
    title: string;
    subtitle: string;
    _links: Links1;
}
export interface Links1 {
    self: SelfOrBookOrProfile;
    book: SelfOrBookOrProfile;
}
export interface SelfOrBookOrProfile {
    href: string;
}
export interface Links {
    self: Self;
    profile: SelfOrBookOrProfile;
}
export interface Self {
    href: string;
    templated: boolean;
}
export interface Page {
    size: number;
    totalElements: number;
    totalPages: number;
    number: number;
}
