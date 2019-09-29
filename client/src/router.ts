import Vue from 'vue';
import Router from 'vue-router';
import Home from './views/Home.vue';

Vue.use(Router);

export default new Router({

  /*
  The difference you see between the Home component and the rest is called `code splitting`. This will split your code
  bundle into smaller bundles.

  The Home component will be loaded at start up, but the other are only imported  when the method is called.
  This way, the initial bundle that is loaded at app startup is smaller. This means that only the main component is
  loaded at start-up.
   */


  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/login',
      name: 'login',
      component: () => import('@/views/Login.vue'),
    },
    {
      path: '/article',
      name: 'article',
      component: () => import('@/views/Article.vue'),
    },
    {
      path: '/editor',
      name: 'editor',
      component: () => import('@/views/Editor.vue'),
    },
    {
      path: '/profile',
      name: 'profile',
      component: () => import('@/views/Profile.vue'),
    },
    {
      path: '/',
      name: 'settings',
      component: () => import('@/views/Settings.vue'),
    },
    {
      path: '/register',
      name: 'register',
      component: () => import('@/views/Register.vue'),
    },
    {
      path: '/books',
      name: 'books',
      component: () => import('@/views/Books.vue'),
    },
  ],
});
