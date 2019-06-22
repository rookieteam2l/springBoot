import Vue from 'vue'
import Router from 'vue-router'
import index from '@/components/index'
import wyhk from '@/components/wyhk'
import loan from '@/components/loan'
import login from '@/components/login'
import myAccount from '@/components/myAccount'
import reg from '@/components/reg'
import reg_ok from '@/components/reg_ok'
import touzi from '@/components/touzi'
import tzgl from '@/components/tzgl'



Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index
    },
    {
      path: '/wyhk',
      name: 'wyhk',
      component: wyhk
    },
    {
      path: '/loan',
      name: 'loan',
      component: loan
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/myAccount',
      name: 'myAccount',
      component: myAccount
    },
    {
      path: '/reg',
      name: 'reg',
      component: reg
    },
    {
      path: '/reg_ok',
      name: 'reg_ok',
      component: reg_ok
    },
    {
      path: '/touzi',
      name: 'touzi',
      component: touzi
    },
    {
      path: '/tzgl',
      name: 'tzgl',
      component: tzgl
    }
  ],

    mode:"history"
})
