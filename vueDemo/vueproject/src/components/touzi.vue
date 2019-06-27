<template>
  <div class="touzi">
    <!--头部-->
    <div class="top">
      <div class="top1">
        <div class="top_1">


          <ul class="zhzx">
            <li>欢迎您</li>
            <li class="li1">18817885258 账户中心</li>
            <li class="back"><a href="index.html">退出</a></li>
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

    <!--中部-->
    <div class="middle">

      <div class="middle_1">
        <div class="middle_1_1">
          <p>当前位置：首页>我要理财>测试2017051701</p>
        </div>
        <div class="middle_1_2">
          <span class="title">测试2017051701</span>
          <span class="more">更多项目></span>
        </div>
      </div>


      <div class="middle_2">
        <div class="middle_2_left">

          <div class="middle_2_left_1">

            <div class="middle_2_left_1_1">

              <div class="middle_2_left_1_1_1">
                <p>预期年化收益率 </p>
                <span class="span1">10.00</span>
                <span class="span2">%</span>
              </div>

              <div class="middle_2_left_1_1_2">
                <p class="p1">投资期限：<span>12个月</span></p>
                <p class="p2">项目总额：<span>100,000.00元</span></p>
                <p class="p3">还款方式：<span>到期还本付息</span></p>
              </div>


              <div class="middle_2_left_1_1_3">
                <p class="p4">剩余金额：<span>100,000.00元</span></p>
                <p class="p5">发布日期：<span>2017-05-17</span></p>
              </div>

            </div>

          </div>

          <div class="ww141">
            <div class="ww141_1"></div>

            <span>进度：0.00%</span>
            <p class="s12">
              可投时间：<span>6</span>天<span>23</span>时<span>53</span>分<span>16</span>秒
            </p>
          </div>

        </div>

        <div class="middle_2_right">
          <div class="middle_2_right_1">
            <p class="p1p">账户余额<span>1898990.00</span>元</p>
            <p class="p2p" @click="open" >充值</p>
          </div>
          <p><input type="text" placeholder="50.00元起投" /><span class="yuan">元</span></p>
          <p><input type="password" placeholder="请输入支付密码"/></p>
          <div class="mstz">
            马上投资
          </div>

        </div>

      </div>

      <div class="tz_tab">
        <ul>
          <li class="active">项目简介</li>
          <li>项目详情</li>
          <li>相关资料披露</li>
          <li>加入记录</li>
        </ul>
        <div class="tz_tab_content">
          <div class="jianjie">简介</div>
          <div class="xiangqing">
            <p>
              <span class="title">计划名称</span>
              <span class="main">测试2017051701</span>
            </p>
            <p>
              <span class="title">可加入日期</span>
              <span class="main">2017-05-17至2017-05-24</span>
            </p>
            <p>
              <span class="title">锁定期</span>
              <span class="main">12个月</span>
            </p>
            <p>
              <span class="title">预计年化收益率</span>
              <span class="main">10.00%</span>
            </p>
            <p>
              <span class="title">加入条件</span>
              <span class="main">50.00元起</span>
            </p>
            <p>
              <span class="title">还款方式</span>
              <span class="main">到期还本付息</span>
            </p>
            <p>
              <span class="title">起息日</span>
              <span class="main">起息日为该理财计划锁定期开始日当天</span>
            </p>
            <p>
              <span class="title">保障方式</span>
              <span class="main">风险准备金逾期垫付，100%本息保障，阳光保险资金安全保障</span>
            </p>
            <p>
              <span class="title">到期时间</span>
              <span class="main">2018-05-24</span>
            </p>
            <p>
              <span class="title">费用说明</span>
              <span class="main">加入费率：0.00%；退出费用：0.00%</span>
            </p>

          </div>
          <div class="pilu">披露</div>
          <div class="jilu">

            <table>
              <thead>
              <tr>
                <th>投资人</th>
                <th>投资金额</th>
                <th>投标时间</th>
                <th>投标方式</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>张三</td>
                <td>1000.00</td>
                <td>2018-07-16</td>
                <td>风投</td>
              </tr>

              </tbody>

            </table>
            <p>暂无数据</p>

          </div>
        </div>
      </div>




    </div>

    <!--=====================底部============================-->
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


    <!--  投资确认框 -->

    <div class="dialog">

      <div class="content_left">
        <ul>
          <li>项目名称：<span>测试2017051701</span></li>
          <li>项目总额：<span class="all_price">￥100000.00</span></li>
          <li>起投总额：<span>￥50.00</span></li>
          <li>预期年化收益率：<span>10.00%</span></li>
          <li>投资期限：<span>12个月</span></li>
          <li>还款方式：<span>到期还本付息</span></li>
          <li>计息方式：<span>满标计算</span></li>
        </ul>
      </div>
      <div class="content_right">

        <div class="close"></div>

        <p class="congzhi">您的可用金额：<span>1898980.00</span>元<a href="###">[我要充值]</a></p>
        <p><label for="">投标金额：</label><input type="text"><span class="danwei">元</span></p>
        <p><label for="">投标密码：</label><input type="password"></p>
        <p><label for="">支付密码：</label><input type="password"><a href="###" class="zfpw">忘记支付密码？</a></p>
        <p><label for="">验证码：</label><input type="text"><span class="yzm">验证码图片</span></p>
        <p class="tb_ok"><a href="myAccount.html">确认投标</a></p>
        <p style="margin:10px 0 0 0">注意：点击按钮表示您将确认投标金额并同意支付</p>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'touzi',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },

  methods: {

    open() {
      this.$prompt('请输入充值金额', '充值', {
        confirmButtonText: '充值',
        cancelButtonText: '取消',
        inputPattern: /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/,
        inputErrorMessage: '请输入数字'
      }).then(({ value }) => {
        this.$axios({
          method: 'post',
          url: '/api/user/login1',
          data: this.qs.stringify({    //这里是发送给后台的数据
            userId: value
          })
        }).then((response) => {          //这里使用了ES6的语法
          console.log(response);
          //请求成功返回的数据
        }).catch((error) => {
          console.log(error)       //请求失败返回的数据
        })
        this.$message({
          type: 'success',
          message: '你充值了: ' + value +'元'
        });
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '取消充值'
        });
      });
    },

    init() {
      /***************投资填写弹窗*******************/
      var mstz_btn = $('.mstz');
      var dialog = $('.dialog');
      var close_btn = $('.dialog .content_right .close');

      mstz_btn.click(function () {

        dialog.show();
      });

      close_btn.click(function () {

        dialog.hide();
      });


      /***************TAB切换栏*******************/


      var tz_tab_li = $('.tz_tab ul li');
      var tz_tab_content = $('.tz_tab .tz_tab_content>div');

      tz_tab_li.eq(0).attr('class', 'active');
      tz_tab_content.eq(0).show();


      $.each(tz_tab_li, function (index, value) {

        $(this).click(function () {


          $(this).addClass('active').siblings().removeClass('active');
          tz_tab_content.eq(index).show().siblings().hide();

        });

      });
    }
  },

  mounted() {
    this.init();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import '../../static/css/touzhi.css';
</style>
