import {VuexModule, Module, getModule, MutationAction} from 'vuex-module-decorators';
import store from '@/store';
import {User, Profile, BookResponse, BooksEntity, Page, Links, Embedded} from '@/store/models';
import * as api from '@/store/api';

@Module({
    namespaced: true,
    name: 'books',
    store,
})
class BookModule extends VuexModule {
    books: Array<BooksEntity> = [];

    @MutationAction({mutate: ['books']})
    async getBooks() {
        console.log("Before API call")
        const test = await api.getAllBooks();
        console.log("Method is called")
        console.log(test)
        return {
            books: test
        };
    }
}


export default getModule(BookModule);

