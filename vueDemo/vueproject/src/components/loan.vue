<template>
  <div class="loan">
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


      <div class="middle_middle">


        <p class="title">个人借款</p>

        <div class="middle_x">
          <div class="middle_left">
						<span class="s1">
						金融P2P平台的借款功能旨在帮助借款用户以低成本获得借款。用户在需要资金时。可通过抵押、质押、信用、担保等借款方式申请借款，浩茗金融线下审核评估后，将会根据结款方式给出融资方案。
						</span>
            <img src="../../static/img/gz.jpg"/>
            <div class="kb"></div>
            <h3>申请条件:</h3>
            <p>1、年龄在22周岁（含）-55周岁（含）具有完全民事行为能力的自然人；</p>
            <p>2、中华人民共和国大陆人民，港、澳、台除外；</p>
            <p>3、具有稳定收入来源；</p>
            <p>4、在现在单位工作满6个月及以上（不包含试用期）。</p>
            <h1>申请材料：</h1>
            <p>1、二代身份证（需在有效期内，不认可护照、户口本、临时身份证等）；</p>
            <p>2、个人信用报告（进阶日期与信用报告开具日期应在15天内有效）；</p>
            <p>3、收入证明（发薪流水、税单等）；</p>
            <p>4、工作证明（劳动合同、工牌、单位开具的工作证明等）；</p>
            <p>5、居住证明（公用事业缴费单、户口薄、银行对账单等）；</p>
            <p>6、资产证明（房产证、车辆登记证、定期存款等、此项可选）。</p>

          </div>
          <form>
          <div class="middle_right">
            <div class="right_jk">
              填写借款申请
            </div>
            <span class="ss1">申请人：</span>
            <input type="text" v-model="addFrom.userName" />
            <span >手机号码</span>
            <input type="text" v-model="addFrom.telephone" />
            <span >所在地区</span>
            <input type="text" v-model="addFrom.address"/>
            <span >借款金额</span>
            <input class="i1" type="text" v-model="loanMoney" placeholder="                                                                万"/>
            <span >借款期限</span>
            <input class="i1" type="text" v-model="loanTerm"  placeholder="                                                                月"/>
            <span >借款方式</span>
            <select v-model="addFrom.loanMode">
              <option disabled value="">请选择</option>
              <option value="1">信用</option>
              <option value="2">质押</option>
              <option value="3">抵押</option>
              <option value="4">担保</option>
            </select>

            <span >借款用途</span>
            <select v-model="addFrom.loanUse">
              <option disabled value="">请选择用途</option>
              <option value="1">短期周转</option>
              <option value="2">生意周转</option>
              <option value="3">生活周转</option>
              <option value="4">购物消费</option>
              <option value="5">不提现借款</option>
              <option value="6">创业借款</option>
              <option value="7">其他借款</option>
            </select>

            <span>验证码：</span>
            <input class="yzm"  v-model="code"/>
            <img alt="验证码" @click="getImg" :src="iSrc" />
            <!--<img src="../../static/img/yzm.jpg"/>-->
            <a>换一张</a>
            <p @click="submit">提交申请</p>
          </div>
         </form>
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
  name: 'loan',
  data () {

    return {
      addFrom:[{
        userName:'',
        telephone:'',
        address:'',
        loanMode:'',
        loanUse:'',
      }],

      loanMoney:'',
      loanTerm:'',
      code:'',
      iSrc:'',

    }
  },

  methods: {

    loadInit(){
      debugger;
      this.$axios({
        method: 'post',
        url: '/api/loan/loan/getUser',
        data: this.qs.stringify({    //这里是发送给后台的数据

        })
      }).then((response) => {          //这里使用了ES6的语法
        console.log(response);
        this.addFrom = response.data.result;//请求成功返回的数据
      }).catch((error) => {
        console.log(error)       //请求失败返回的数据
      })
    },


    getImg(){
      this.$axios({
        method: 'post',
        url: '/api/defaultKaptcha?d=\'+new Date()*1',
        data: this.qs.stringify({    //这里是发送给后台的数据

        })
      }).then((response) => {          //这里使用了ES6的语法
        console.log(response);//请求成功返回的数据
        this.iSrc='data:image/jpeg;base64,'+ response.data.img;
      }).catch((error) => {
        console.log(error)       //请求失败返回的数据
      })
    },


    submit(){

      let param = Object.assign({}, this.addFrom);
      param.loanMoney = this.loanMoney;
      param.loanTerm = this.loanTerm;
      param.code = this.code;
      this.$axios.post('/api/loan/loan/addLoan',param).then((response) => {          //这里使用了ES6的语法
        console.log(response);
        if (response.data.status=='SUCCESS') {
          this.$router.push('/myAccount');
        }
      }).catch((error) => {
        console.log(error)       //请求失败返回的数据
      })
    }
  },

  mounted() {
    this.loadInit();
    this.getImg();
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import '../../static/css/loan.css';
</style>
