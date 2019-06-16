<template>
  <div class="reg">
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
            <li><a href="index.html">首页</a></li>
            <li><a href="touzhi.html">我要理财</a></li>
            <li><a href="loan.html">我要借款</a></li>
            <li><a href="###">我要还款</a></li>
            <li><a href="myAccount.html">我的账户</a></li>
          </ul>
        </div>
      </div>


    </div>


    <!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部-->

    <div class="reg_mian">
      <div class="reg_top"></div>
      <form action="" class="reg_login">
        <p>
          <label for="">手机号码</label>
          <input type="text" placeholder="手机号码">
          <span class="ok"></span>
        </p>
        <p>
          <label for="">密码</label>
          <input type="text" placeholder="6-16位数字和字符">
          <span class="ok"></span>
        </p>
        <p>
          <label for="">确认密码</label>
          <input type="text" placeholder="6-16位数字和字符">
          <span class="ok"></span>
        </p>
        <p class="yzm">
          <label for="">验证码</label>
          <input type="text">
          <span>获取验证码</span>
        </p>
        <p>
          <label for="">邀请人</label>
          <input type="text" placeholder="邀请码（非必填）">
        </p>
        <p class="agree">
          <input type="checkbox">我已阅读，并同意注册协议
        </p>
        <p>
          <a href="reg_ok.html">下一步</a>
          <span class="login">已有账户，登陆</span>
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
export default {
  name: 'reg',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import '../../static/css/reg.css';
  @import '../../static/js/reg.js';
  @import '../../static/js/jquery-3.4.1.js';
</style>
