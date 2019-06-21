<template>
  <div class="tzgl">
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
            <p class="p2">188***5258</p>
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

        <div class="ddd">
          <div class="content_right" >


            <div class="news">

              <dl class="content_right_dl">
                <dt>累计投资(元)</dt>
                <dd>200000.00</dd>
              </dl>
              <!--
                            <dl class="content_right_dl">
                                <dt>投资中冻结金额(元)</dt>
                                <dd>0.00</dd>
                            </dl>-->
              <dl class="content_right_dl2">
                <dt>投标中(bi)</dt>
                <dd>0</dd>
              </dl>
              <dl class="content_right_dl2">
                <dt>还款中(笔)</dt>
                <dd>1</dd>
              </dl>
              <!--
                            <dl class="content_right_dl2">
                                <dt>转让中(笔)</dt>
                                <dd>0</dd>
                            </dl>
                            -->
            </div>


            <div class="teble_tab">

              <ul>
                <li >投资中</li>
                <li >还款中</li>
                <li >已完成</li>
                <li >转让中</li>
              </ul>

              <div class="content">
                <div class="box0">
                  <table>
                    <tr>
                      <th>项目名称</th>
                      <th>应收日期</th>
                      <th>借款者</th>
                      <th>第几期/总期数</th>
                      <th>应收金额</th>
                      <th>应收利息</th>
                      <th>状态</th>
                    </tr>
                    <tr>
                      <td>测试20170517</td>
                      <td>2018-05-17</td>
                      <td>15937003594</td>
                      <td>1/1</td>
                      <td>110000</td>
                      <td>10000</td>
                      <td>还款中</td>
                    </tr>

                  </table>



                </div>

                <div class="box1"></div>
                <div class="box2"></div>
                <div class="box3"></div>
              </div>


            </div>

            <div class="table_page">

              <span>&lt;</span>
              <span>1</span>
              <span>&gt;</span>

            </div>



          </div>

        </div>

        <div style="width:100%;clear:both"></div>

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
  name: 'tzgl',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods:{
    init(){
// 左侧列表
      var li = $('ul.list_mi li a');
      li.eq(1).css('color','#f35d08').css('background','#fff');
      $.each(li,function(index,value){
        $(this).hover(function(){
          $(this).css('color','#f35d08').css('background','#fff');
          li.eq(1).css('color','#f35d08').css('background','#fff');
        },function(){
          $(this).css('color','#fff').css('background','#f7772c');
          li.eq(1).css('color','#f35d08').css('background','#fff');
        });

      });

// tab切换栏
      var tab_li = $('.teble_tab ul li');
      tab_li.eq(0).css('color','#f7772c').css('borderBottom','none');
      $.each(tab_li,function(index,value){
        $(this).click(function(){
          $(this).css('color','#f7772c').css('borderBottom','none').siblings().css('color','#665d56').css('borderBottom','#e7e7e7 solid 1px');
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
  @import '../../static/css/tzgl.css';
</style>
