<template>
  <div class="reg_ok">
    <div class="top">
      <div class="top1">
        <div class="top_1">
          <ul class="app">
            <li>APP下载</li>
            <li>帮助中心</li>
          </ul>
          <ul class="zhzx">
            <li>欢迎您</li>
            <li class="li1">18817885258 账户中心</li>
            <li class="back"><a href="index.html">退出</a></li>
            <li>积分商城</li>
          </ul>
        </div>
      </div>
      <div class="top2">
        <div class="top_2">
          <ul class="top_2_ul">
            <li><router-link to="/">首页</router-link></li>
            <li><router-link to="/touzi">我要理财</router-link></li>
            <li><router-link to="/loan">我要借款</router-link></li>
            <li><router-link to="/wyhk">我要还款</router-link></li>
            <li><router-link to="/myAccount">我的账户</router-link></li>
          </ul>
        </div>
      </div>


    </div>


    <!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部-->

    <div class="reg_ok_mian">
      <div class="reg_ok_top"></div>
      <form action="" class="reg_login">
        <p>
          <label for="">真实姓名</label>
          <input type="text" placeholder="请填写真实姓名">
        </p>
        <p>
          <label for="">身份证号码</label>
          <input type="text" placeholder="请填写身份证号码">
        </p>
        <p>

          <a href="myAccount.html">提交</a>
          <span>跳过此步</span>
        </p>
      </form>
    </div>




    <!--底部--><!--底部--><!--底部--><!--底部--><!--底部--><!--底部-->


    <div class="bottom">

      <div class="bottom_content">
        <ul class="bottom_ul">
          <li>关于我们</li>
          <li>帮助中心</li>
          <li>安全保障</li>
          <li>咨询中心</li>
          <li>专题中心</li>
        </ul>

        <div class="bottom_zbox">
          <div class="zbox_1">
            <div class="bottom_img1">
              <img src="../../static/img/wb.jpg"/>
              新浪微博
            </div>
            <div class="bottom_img1">
              <img src="../../static/img/wx.jpg"/>
              微信
            </div>
            <div class="bottom_img1">
              <img src="../../static/img/sj.jpg"/>
              手机APP
            </div>
          </div>
        </div>

        <div class="server">
          <div class="bottom_text">客服电话</div>
          <div class="bottom_text2">666-666-8888</div>
          <div class="bottom_text3">
            <p class="s1">123456789@qq.com</p>
            <p class="s2">09:30 - 18:00</p>

          </div>
        </div>

      </div>

      <div class="bottom_content2">

        <p class="p11"><img src="../../static/img/cxwz.jpg"/></p>


        <p class="p22">Copyright©2019  版权所有 </p>

      </div>

    </div>
  </div>
</template>

<script>

export default {
  name: 'reg_ok',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import '../../static/css/reg_ok.css';
</style>
