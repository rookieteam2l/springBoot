<template>
  <div class="index">
    <!--头部-->
    <div class="top">
      <div class="top1">
        <div class="top_1">
          <router-link to="/login">登陆</router-link>|<router-link to="/reg">注册</router-link>
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
    <router-view></router-view>
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
          <ul class="middle_2_2" id="ProjectStatus">
            <li style="pointer-events: none;" class="spanaa">项目状态</li>
            <li class="spanbb" value="0">不限</li>
            <li value="1">投资中</li>
            <li value="2">收益中</li>
            <li value="3">已完成</li>
          </ul>
          <ul class="middle_2_3" id="rate" >
            <li style="pointer-events: none;" class="spanaa">利率范围</li>
            <li value="0" class="spanbb">不限</li>
            <li value="1" >12%以下</li>
            <li value="2" >12%~18%</li>
            <li value="3">18%以上</li>
          </ul>
          <ul class="middle_2_4" id="term">
            <li style="pointer-events: none;" class="spanaa">借款期限</li>
            <li class="spanbb" value="0">不限</li>
            <li value="1">1~3个月</li>
            <li value="2">3~6个月</li>
            <li value="3">6~12个月</li>
          </ul>
          <ul class="middle_2_5" id="Repayment">
            <li style="pointer-events: none;" class="spanaa">还款方式</li>
            <li value="0" class="spanbb">不限</li>
            <li value="1">先息后本</li>
            <li value="2">到期还本付息</li>
          </ul>
        </div>
      </div>

      <div class="middle_3" v-for="project in MdProject" v-bind:key="project.id">
        <div class="middle_3_1 title">
          <span class="middle_3_1_span">{{project.name}}</span>
          <img src="../../static/img/hot.jpg"/>
        </div>
        <ul class="middle_3_2">
          <li>
            <p>预期年化利率</p>
            <span class="middle_3_2_span">{{project.rate}}%</span>

          </li>
          <li>
            <p>投资期限</p>
            <span>{{project.touziqixian}}个月</span>
          </li>
          <li>
            <p>还款方式</p>
            <span>{{project.huank}}</span>
          </li>
          <li>
            <p>项目总额</p>
            <span>{{project.ze}}元</span>
          </li>
        </ul>
        <div class="middle_3_box1" v-if="project.percentage >= 100">
          <el-progress type="circle"  :percentage="project.percentage" status="success" :width="100"></el-progress>
        </div>
        <div class="middle_3_box1" v-else="project.percentage < 100">
          <el-progress type="circle"  :percentage="project.percentage"  :width="100"></el-progress>
        </div>
        <div v-if="project.status == 1" class="middle_3_3_1">
          已结束
        </div>
        <div v-else="project.status == 2" class="middle_3_3">
          <a href="#"  @click="info(project.id)">我要投资</a>
        </div>
      </div>

      <ul class="middle_bottom" id="middle_bottom">
        <div>

          <li v-if="cur>1"><a class="middle_bottom_a"  v-on:click="cur--,pageClick()">上一页</a></li>

          <li v-if="cur==1"><a class="banclick">上一页</a></li>

          <li v-for="index in indexs"  v-bind:class="{ 'selected': cur == index}">
            <a class="middle_bottom_a" v-on:click="btnClick(index)">{{ index }}</a>
          </li>

          <li v-if="cur!=all"><a class="middle_bottom_a" v-on:click="cur++,pageClick()">下一页</a></li>

          <li v-if="cur == all"><a  class="banclick">下一页</a></li>
        </div>
      </ul>
      <div class="middle_bottom_paging">
      <span >当前展示 10 条记录，共666条记录</span>
      </div>
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
  name: 'index',
  data () {
    return {
      all: 10, //总页数
      cur: 1,//当前页码
      currentPage:0,
      isOK:true,
      projectStatus:0,
      rate:0,
      term:0,
      repayment:0,
      userId: '',
      username: '',
      addFrom:[{
        userId:'',
        username:'',

      }],
      queryDate:[{
          projectStatus:0,
          rate:0,
          term:0,
          repayment:0,
        }],
      MdProject:[
        {
          id:1,
          name:"测试6",
          rate:20.00,
          touziqixian:10,
          huank:"到期还款1",
          ze:6666,
          status:1,
          percentage:100,
        },
        {
          id:2,
          name:"测试66",
          rate:66.00,
          touziqixian:8,
          huank:"到期还款2",
          ze:88888,
          status:1,
          percentage:100,
        },
        {
          id:3,
          name:"测试666",
          rate:22.00,
          touziqixian:6,
          huank:"到期还款3",
          ze:99999,
          status:2,
          percentage:60,
        },
      ]
    }
  },

  watch: {
    cur: function(oldValue , newValue){
      console.log(arguments);
    }
  },
  methods: {

    search: function(){
      alert(this.cur+""+this.all);
    },

    btnClick: function(data){//页码点击事件
      if(data != this.cur){
        this.cur = data
      }
      this.search();
    },
    pageClick: function(){
      console.log('现在在'+this.cur+'页');
      this.search();
    },

    info(id){
      this.$router.push({
        path:"/touzi",
/*        params:{
          id:id,
        }*/
        query:{
          id:id,
        }
      });
    },
    postceshi() {
      this.$axios({
        method: 'post',
        url: '/api/user/login1',
        data: this.qs.stringify({    //这里是发送给后台的数据
          userId: '123',
          username: 'zhangsan',
        })
      }).then((response) => {          //这里使用了ES6的语法
        console.log(response);
        this.addFrom = response.data.result;//请求成功返回的数据
      }).catch((error) => {
        console.log(error)       //请求失败返回的数据
      })
    },

    init() {

      let projectStatus =0;
      let rate =0;
      let term =0;
      let repayment=0;
      $("#ProjectStatus li").click(function () {
        $(this).siblings('li').removeClass('spanbb');  // 删除其他兄弟元素的样式
        $(this).addClass('spanbb');// 添加当前元素的样式
        projectStatus=this.value;

        $.ajax({
          url: '/api/index/getProject',
          type: "post",
          dataType:"JSON",
          data:{
            projectStatus:projectStatus,
            rate:rate,
            term:term,
            repayment:repayment
          },
          success: function(data){

          },
        });
      });

      $("#rate li").click(function () {
        $(this).siblings('li').removeClass('spanbb');  // 删除其他兄弟元素的样式
        $(this).addClass('spanbb'); // 添加当前元素的样式
        rate = this.value;
        $.ajax({
          url: '/api/index/getProject',
          type: "post",
          dataType:"JSON",
          data:{
            projectStatus:projectStatus,
            rate:rate,
            term:term,
            repayment:repayment
          },
          success: function(data){

          },
        });
      });

      $("#term li").click(function () {
        $(this).siblings('li').removeClass('spanbb');  // 删除其他兄弟元素的样式
        $(this).addClass('spanbb');                    // 添加当前元素的样式
        term=this.value;
        $.ajax({
          url: '/api/index/getProject',
          type: "post",
          dataType:"JSON",
          data:{
            projectStatus:projectStatus,
            rate:rate,
            term:term,
            repayment:repayment
          },
          success: function(data){

          },
        });
      });

      $("#Repayment li").click(function () {
        $(this).siblings('li').removeClass('spanbb');  // 删除其他兄弟元素的样式
        $(this).addClass('spanbb'); // 添加当前元素的样式
        repayment=this.value;
        $.ajax({
          url: '/api/index/getProject',
          type: "post",
          dataType:"JSON",
          data:{
            projectStatus:projectStatus,
            rate:rate,
            term:term,
            repayment:repayment
          },
          success: function(data){

          },
        });
      });

    },
  },

  computed: {
    indexs: function(){
      // 定义开始的数字
      var left = 1;
      // 定义结束的数字
      var right = this.all;

      // 存储返回值
      var ar = [];

      // 前提条件：每次都显示condition条页码
      // 最好是个单数
      var condition = 5;

      // 向上取整->就能获取到中间的数字
      var middle = Math.ceil(condition/2);

      // 要分清情况
      //1、在最左边或者在middle的前面
      //2、在中间
      //3、最右边的情况

      // 当总页数超过condition时，需要判断分页情况
      if(this.all>= condition){
        // 中间的时候
        // 左右都加上（middle-1)
        if(this.cur > middle && this.cur < this.all-(middle-1)){
          left = this.cur - (middle-1)
          right = this.cur + (middle-1)
        }else{
          //最左边或者在condition的中间
          if(this.cur<=middle){
            left = 1
            right = condition
            // 最右边的情况
            // 结束是总条数，开始是condition减去1
          }else{
            right = this.all
            left = this.all -(condition-1)
          }
        }
      }
      while (left <= right){
        ar.push(left)
        left ++
      }
      return ar
    }
  },

  mounted(){
   // this.postceshi();
    this.init();

  }
  }



</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>


  .selected{
    background: #f7772c !important;
  }
</style>
<style scoped>
  @import '../../static/css/index.css';

  .middle_bottom_paging{
    width: 320px;
    height: 60px;
    margin: 0 auto;
    margin-top:10px ;
  }
  .banclick{
    display:block;
    width: 60px;
    height: 40px;
    cursor:not-allowed;
  }

  .middle_bottom_a{
    display:block;
    width: 60px !important;
    height: 40px !important;
  }
  .middle_3_box1{
    width: 100px;
    height: 100px;
    position: absolute;
     top: 50px;
    left: 780px;
  }
</style>
