<template>
  <div class="myAccount">
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


    <!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部--><!--中部-->



    <div class="middle">
      <div class="middle_content"id="content_right">

        <div class="content_left">


          <div class="content_photo">
            <div class="photo">
              <img src="../../static/img/未标题-1.png"/>
            </div>
            <input type="file" />
          </div>

          <div class="tel">
            <p class="p1">18817885258</p>
            <p class="p2">410***321X</p>
          </div>

          <div class="img_list" id="img_list">
            <div class="img1"></div>
            <div class="img2"></div>
            <div class="img3"></div>
          </div>


          <ul class="list_mi" id="list_mi">
            <li><a href="myAccount.html">我的账户</a></li>
            <li><a href="tzgl.html">投资管理</a></li>
            <li><a href="wyhk.html">我要还款</a></li>
            <li><a href="###">资金记录</a></li>

            <li class="pas"><a href="###">密码设置</a></li>
            <li class="ss"><a href="###">消息中心</a></li>
          </ul>




        </div>








        <!--右侧-->	<!--右侧-->	<!--右侧-->	<!--右侧-->	<!--右侧-->

        <div class="content_right" >

          <div class="right_top">
            <div class="right_top_1">

            </div>
            <p>可用余额:¥1898980000.00</p>

            <p>累计收益:¥888865.00</p>

            <div class="cc">
              <div @click="open" class="cz">
                充值
              </div>
              <p>昨日收益 <span>3.00</span></p>
            </div>
          </div>
          <!--
                    <div class="right_2">
                        <div class="right_2_1"></div>
                        <p>代收本息<span>110000</span>.00元</p>
                        <a href="###">查看投资中项目</a>


                    </div>
                    <div class="right_3">
                        <div class="right_3_1"></div>
                        <div class="right_3_2">
                            2008980.00
                        </div>
                        <p class="right_3_3">总资产</p>
                        <div class="right_3_4">

                            代收本息<span>2016666</span>.67元

                            <p class="right_3_4_1">
                                冻结资金
                                <span>0</span>
                                .00元
                            </p>

                        </div>

                    </div>
                    <div class="right_4">

                    </div>
                    -->
          <div class="right_5">
            <div class="right_5_1">
              资金记录
            </div>

            <div class="right_5_2">
              <ul>
                <li>交易记录</li>
                <li>交易类型</li>
                <li>交易详情</li>
                <li>金额</li>
                <li>余额</li>
              </ul>
            </div>
            <div class="right_5_3">
              <ul>
                <li>2017-15-18 09:56:46</li>
                <li>用户回款</li>
                <li>18817885259</li>
                <li>+100000</li>
                <li>1898980</li>
              </ul>
            </div>
            <div class="right_5_3">
              <ul>
                <li>2017-15-18 09:56:46</li>
                <li>资金冻结</li>
                <li>18817885259</li>
                <li>-542121</li>
                <li>8989856</li>
              </ul>
            </div>
            <div class="right_5_3">
              <ul>
                <li>2017-15-18 09:56:46</li>
                <li>投标成功</li>
                <li>18817885259</li>
                <li>+111156</li>
                <li>8888888</li>
              </ul>
            </div>
            <div class="right_5_3">
              <ul>
                <li>2017-15-18 09:56:46</li>
                <li>资金冻结</li>
                <li>18817885259</li>
                <li>-561614</li>
                <li>2225655</li>
              </ul>
            </div>

            <div class="right_5_3">
              <ul>
                <li>2017-15-18 09:56:46</li>
                <li>借款手续费</li>
                <li>18817885259</li>
                <li>-100000</li>
                <li>565461</li>
              </ul>
            </div>

            <div class="right_5_3">
              <ul>
                <li>2017-15-18 09:56:46</li>
                <li>借款成功</li>
                <li>18817885259</li>
                <li>+100000</li>
                <li>1547544</li>
              </ul>
            </div>

            <div class="right_zx">
              <div class="zxx">

                <span id="s1"><</span>
                <div>1</div>
                <span id="s2">></span>
              </div>
            </div>
          </div>

        </div>
        <div class="div_box">
          2
        </div>
        <div class="div_box">
          3
        </div>
        <div class="div_box">
          4
        </div>
        <div class="div_box">
          5
        </div>
      </div>
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
  name: 'myAccount',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods:{

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

    init(){
      var li = $('ul.list_mi li a');
      li.eq(0).css('color','#f35d08').css('background','#fff');
      $.each(li,function(index,value){
        $(this).hover(function(){
          $(this).css('color','#f35d08').css('background','#fff');
          li.eq(0).css('color','#f35d08').css('background','#fff');
        },function(){
          $(this).css('color','#fff').css('background','#f7772c');
          li.eq(0).css('color','#f35d08').css('background','#fff');
        });
      });

      var img = document.getElementById('img_list');
      var img1= img.children;

      for (var i=0;i<img1.length;i++) {
        img1[i].setAttribute('index',i);
        img1[0].onclick=function(){
          this.style.background='url(img/shouji.jpg) no-repeat';
          img1[2].style.background='url(img/shenfen.jpg) no-repeat';
          img1[1].style.background='url(img/youxiang.jpg) no-repeat';
        }
        img1[1].onclick=function(){
          this.style.background='url(img/youxi.jpg) no-repeat';
          img1[0].style.background='url(img/shou.jpg) no-repeat';
          img1[2].style.background='url(img/shenfen.jpg) no-repeat';
        }
        img1[2].onclick=function(){
          this.style.background='url(img/shenf.jpg) no-repeat';
          img1[0].style.background='url(img/shou.jpg) no-repeat';
          img1[1].style.background='url(img/youxiang.jpg) no-repeat';
        }
      }

      $("[type=file]").change(function(){
        var tag = $(this) ;
        var file = this.files[0] ;
        var fr = new FileReader();
        console.log(fr);
        fr.readAsDataURL(file);
        fr.onload = function(){
          tag.prev().find("img").attr('src' ,fr.result) ;
        }
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
  @import '../../static/css/myAccount.css';
</style>
