import axios from 'axios'

const SERVER_URL = 'http://localhost:9000';

const instance = axios.create({
    baseURL: SERVER_URL,
    timeout: 1000
});

export default {

    getAll: () => instance.get('api/books', {
        transformResponse: [function (data) {
            return data? JSON.parse(data)._embedded.books : data;
        }]
    })

}