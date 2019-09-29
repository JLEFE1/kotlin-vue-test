import axios from 'axios';
import {BookResponse, User, UserResponse, UserSubmit} from '@/store/models';

const authorization = 'Authorization';

export const conduitApi = axios.create({
    // baseURL: 'https://conduit.productionready.io/api',
    baseURL: 'http://localhost:9000/api',
});

export function setJWT(jwt: string) {
    conduitApi.defaults.headers.common[authorization] = 'Token ${jwt}';
}

export function clearJWT(jwt: string) {
    delete conduitApi.defaults.headers.common[authorization];
}

export async function loginUser(user: UserSubmit): Promise<UserResponse|undefined> {
    try {
        const response =  await axios.post('/users/login', {
            user,
        });
        return (response.data as UserResponse);
    } catch (e) {
        console.error(e);
    }
}

export async function getAllBooks() {
    const response = await conduitApi.get('/books');
    return (response.data as BookResponse)._embedded.books;
}

export async function allBooks() {
    axios.get('http://localhost:9000/api/books')
        .then(function (response) {
            // handle success
            console.log(response);
        })
        .catch(function (error) {
            // handle error
            console.log(error);
        })
        .finally(function () {
            console.log("Finally block is called");
        });
}
