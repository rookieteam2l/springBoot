import Vue from 'vue'
import Router from 'vue-router'
import index from '@/components/index'
import wyhk from '@/components/wyhk'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index
    },
    {
      path: '/',
      name: 'wyhk',
      component: wyhk
    }
  ]
})
