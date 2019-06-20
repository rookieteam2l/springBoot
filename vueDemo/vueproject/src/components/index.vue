<template>
  <div class="index">
    <!--头部-->
    <div class="top">
      <div class="top1">
        <div class="top_1">
          <a href="login.html">登陆</a>|<a href="reg.html">注册</a>
        </div>
      </div>
      <div class="top2">
        <div class="top_2">
          <ul class="top_2_ul">
            <li><a href="index.vue">首页</a></li>
            <li><a href="touzhi.vue">我要理财</a></li>
            <li><a href="loan.vue">我要借款</a></li>
            <li><a href="wyhk.vue">我要还款</a></li>
            <li><a href="myAccount.vue">我的账户</a></li>
          </ul>
        </div>
      </div>

    </div>


    <!--middle-->	<!--middle-->	<!--middle-->	<!--middle-->	<!--middle-->


    <div class="middle">


      <div class="middle_1" >
        <div class="middle_1_1">
          <p>当前位置：首页</p>
        </div>
        <ul class="middle_1_2"id="middle_1_2">
          <li>项目列表</li>
        </ul>
      </div>

      <div id="middle_2">
        <div class="middle_2">

          <ul class="middle_2_2">
            <li class="spanaa">项目状态</li>
            <li class="spanbb">不限</li>
            <li>投资中</li>
            <li>收益中</li>
            <li>已完成</li>
          </ul>
          <ul class="middle_2_3">
            <li class="spanaa">利率范围</li>
            <li class="spanbb">不限</li>
            <li>12%以下</li>
            <li>12%~18%</li>
            <li>18%以上</li>
          </ul>
          <ul class="middle_2_4">
            <li class="spanaa">借款期限</li>
            <li class="spanbb">不限</li>
            <li>1~3个月</li>
            <li>3~6个月</li>
            <li>6~12个月</li>
          </ul>
          <ul class="middle_2_5">
            <li class="spanaa">还款方式</li>
            <li class="spanbb">不限</li>
            <li>先息后本</li>
            <li>到期还本付息</li>
          </ul>
        </div>



      </div>
      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">测试2019{{addFrom.username}}</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">10.00%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>12个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>10,000.00元</span>
          </li>

        </ul>

        <div class="box">
          0%
        </div>

        <div class="middle_3_3">
          <a href="#"  onclick="postceshi()">我要投资</a>
        </div>
      </div>







      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标9.5</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">9.50%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>1个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标9.4</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">9.40%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>1个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标9.3</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">9.30%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>1个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标9.2</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">9.20%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>1个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标9.1</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">9.10%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>1个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标3个月</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">12.00%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>3个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标12个月</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">12.00%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>12个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3">
          <a href="touzhi.html">我要投资</a>
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标6个月</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">12.00%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>6个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <div class="middle_3">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">体验标1个月</span>
          <img src="img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">12.00%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>1个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>到期还本付息</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>0.00元</span>
          </li>

        </ul>

        <div class="box">
          null%
        </div>

        <div class="middle_3_3_1">
          已结束
        </div>
      </div>

      <ul class="middle_bottom" id="middle_bottom">
        <li><</li>
        <div>
          <li class="active">1</li>
          <li>2</li>
          <li>3</li>
          <li>4</li>
          <li>5</li>
          <li>6</li>
          <li>7</li>
          <li>8</li>
        </div>

        <li>></li>
      </ul>






    </div>




    <!--底部--><!--底部--><!--底部--><!--底部--><!--底部--><!--底部--><!--底部-->

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
  name: 'index',
  data () {
    return {

      userId: '',
      username: '',
      addFrom:[{
        userId:'',
        username:'',

      }]
    }
  },

  methods:{
    postceshi(){
      this.$axios({
        method:'post',
        url:'/api/user/login',
        data:this.qs.stringify({    //这里是发送给后台的数据
          userId:'123',
          username:'zhangsan',
        })
      }).then((response) =>{          //这里使用了ES6的语法
        console.log(response);
        this.addFrom = response.data.result;//请求成功返回的数据
        alert(response.data.result.username);
      }).catch((error) =>{
        console.log(error)       //请求失败返回的数据
      })
    },
  },

  mounted(){

    this.postceshi();
  }

  }



</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import '../../static/css/index.css';
  @import '../../static/js/index.js';

</style>
