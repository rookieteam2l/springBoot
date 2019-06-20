<template>
  <div class="login">
    <div id="testDiv">
      <input type="button" id="test" value="测试" />
      <input type="button" onclick='aa()' class="ceshi" value="测试button" />
    </div>

    <div class="top">
      <div class="top1">
        <div class="top_1">
          <a href="reg_ok.html">登陆</a>|<a href="reg.html">注册</a>
        </div>
      </div>
      <div class="top2">
        <div class="top_2">
          <ul class="top_2_ul">
            <li><a href="index.html">首页</a></li>
            <li><a href="touzhi.html">我要理财</a></li>
            <li><a href="loan.html">我要借款</a></li>
            <li><a href="wyhk.html">我要还款</a></li>
            <li><a href="myAccount.html">我的账户</a></li>
          </ul>
        </div>
      </div>


    </div>


    <!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部-->

    <div class="reg_ok_mian">
      <form action="" class="reg_login">
        <p>
          <label for="">用户名/手机号</label>
          <input type="text" placeholder="请填写用户名或手机号">
        </p>
        <p>
          <label for="">密码</label>
          <input type="password" placeholder="请填写密码">
        </p>
        <p>

          <a href="index.html">登录</a>
          <span>注册</span>
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
              <img src="img/wb.jpg"/>
              新浪微博
            </div>
            <div class="bottom_img1">
              <img src="img/wx.jpg"/>
              微信
            </div>
            <div class="bottom_img1">
              <img src="img/sj.jpg"/>
              手机APP
            </div>
          </div>
        </div>

        <div class="server">
          <div class="bottom_text">客服电话</div>
          <div class="bottom_text2">400-611-4589</div>
          <div class="bottom_text3">
            <p class="s1">server@hmjr99.com</p>
            <p class="s2">09:30 - 18:00</p>

          </div>
        </div>




      </div>





      <div class="bottom_content2">

        <p class="p11"><img src="img/cxwz.jpg"/></p>


        <p class="p22">Copyright©2014 浩茗金融 版权所有 沪ICP备16002185号-1</p>

      </div>

    </div>
  </div>
</template>

<script>
  import $ from 'jquery'

export default {
  name: 'login',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
