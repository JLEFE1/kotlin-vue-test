<template>
    <div class="auth-page">
        <div class="container page">
            <div class="row">

                <div class="col-md-6 offset-md-3 col-xs-12">
                    <h1 class="text-xs-center">Sign up</h1>
                    <p class="text-xs-center">
                        <router-link to="/register">
                            Need an account
                        </router-link>
                    </p>

                    <form>
                        <fieldset class="form-group">
                            <input
                                    class="form-control form-control-lg"
                                    placeholder="Email"
                                    v-model="email"
                                    type="text">
                        </fieldset>
                        <fieldset class="form-group">
                            <input
                                    class="form-control form-control-lg"
                                    placeholder="Password"
                                    v-model="password"
                                    type="password">
                        </fieldset>
                        <button
                                class="btn btn-lg btn-primary pull-xs-right"
                                @click="login()">
                            Sign up
                        </button>
                    </form>
                </div>

            </div>
        </div>
    </div>
</template>

<script>
    import {Component, Vue} from 'vue-property-decorator';

    @Component
    export default class Login extends Vue {
        email = '';
        password = '';

        login() {
            console.log('login with email = ${this.email}')
        }
    }
</script>