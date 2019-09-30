<template>
    <div>
        Testing books
<!--        <p v-for="book in books">{{ book }}</p>-->
        {{ books }}
    </div>
</template>

<script>
    import {Component, Vue} from 'vue-property-decorator';
    import books from '@/store/modules/books.ts';
    import * as api from '@/store/api';

    @Component
    export default class Books extends Vue {

        // console.log("Books view is instiantiated");
        get books() {
            console.log("books getter is used");
            console.log(books.getBooks());
            return api.allBooks();
        }
    }
</script>
