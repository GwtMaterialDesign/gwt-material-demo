$wnd.gwtmaterialdemo.runAsyncCallback7("function RCd(){}\nfunction TCd(){}\nfunction jzb(){izb()}\nfunction h0b(a,b){a.o=b}\nfunction n0b(a){this.a=a}\nfunction p0b(a){this.a=a}\nfunction r0b(a){this.a=a}\nfunction XCd(a){this.a=a}\nfunction ZCd(a){this.a=a}\nfunction Ss(a){ot((dt(),a))}\nfunction Pyb(a){!!Fyb&&$B(Fyb,a)}\nfunction e0b(a){j0b(a.k,a.o,a.i,a.f)}\nfunction f0b(a){j0b(a.k,a.o,a.i,a.f)}\nfunction i0b(a,b){h0b(a,(Sxb(),b.tb))}\nfunction izb(){izb=Tvb;hzb=new Xz}\nfunction Syb(){if(!Jyb){Lzb();Jyb=true}}\nfunction d0b(a){a.k.style[Llf]=Mlf+a.e+' '+a.g}\nfunction bDd(a){var b;if(!a.d){b=new QCd;a.d=b}return a.d}\nfunction WCd(a){this.a=new XCd(this);this.b=new ZCd(this);this.c=a}\nfunction JCd(a,b,c){dKb();CKb.call(this,a,b,c,(iud(),gud))}\nfunction Nyb(a){Qyb();Syb();return Lyb((izb(),izb(),hzb),a)}\nfunction Lzb(){var b=$wnd.onscroll;$wnd.onscroll=eYe(function(a){try{Jyb&&Pyb((su($doc),tu($doc),new jzb))}finally{b&&b(a)}})}\nfunction aDd(a){var b,c;if(!a.c){c=new JCd(qHb(kLb(a.a)),(b=bDd(a),b),_Cd(a));XJb((nLb(a.a),c),lNb(nLb(a.a)));a.c=c}return a.c}\nfunction k0b(a){if(a.a){a.k.style[r1e]=Rlf+a.j+'ms '+a.b;a.k.style[s1e]=Rlf+a.j+'ms '+a.b}else{a.k.style[r1e]='';a.k.style[s1e]=''}}\nfunction c0b(a){$doc.documentElement.style[F_e]=a.p;(Sxb(),a.tb).style[J_e]=(vw(),aZe);!a.Y&&(a.Y=new Q3c(a));N3c(a.Y);if(a.c){Mo(a);a.c=false}yB(a,a)}\nfunction QCd(){UKb.call(this);SKb(this,VCd(new WCd(this)));bud(this.b);Go(this.b,new RCd,vB?vB:(vB=new Xz));Go(this.b,new TCd,(!AB&&(AB=new Xz),AB));i0b(this.b,this.a)}\nfunction l0b(){rSb.call(this,Mt($doc),xE(rE(ntb,1),V$e,2,6,['material-cutout']));this.d=(Ozc(),nvc);this.i=10;this.n=0.8;this.a=true;this.b='ease';this.f=false;this.c=false;this.j=500;this.k=Mt($doc);rs((Sxb(),this.tb),this.k);this.tb.style[F_e]=(Qx(),q$e);this.tb.style[J_e]=(vw(),aZe)}\nfunction j0b(a,b,c,d){var e,f,g,h,i;h=((b.offsetTop||0)|0)-$wnd.Math.max($wnd.$('html').scrollTop(),$wnd.$(zZe).scrollTop());g=yt((dt(),ct),b);i=(b.offsetWidth||0)|0;f=(b.offsetHeight||0)|0;if(d){if(i!=f){e=i-f;if(i>f){f+=e;h-=e/2}else{e=-e;i+=e;g-=e/2}}}h-=c;g-=c;i+=c*2;f+=c*2;$wnd.$(a).css(H_e,h+v$e);$wnd.$(a).css(k$e,g+v$e);$wnd.$(a).css(ZYe,i+v$e);$wnd.$(a).css(YYe,f+v$e)}\nfunction ot(a){var b=a.offsetLeft,c=a.offsetTop;var d=a.offsetWidth,e=a.offsetHeight;if(a.parentNode!=a.offsetParent){b-=a.parentNode.offsetLeft;c-=a.parentNode.offsetTop}var f=a.parentNode;while(f&&f.nodeType==1){b<f.scrollLeft&&(f.scrollLeft=b);b+d>f.scrollLeft+f.clientWidth&&(f.scrollLeft=b+d-f.clientWidth);c<f.scrollTop&&(f.scrollTop=c);c+e>f.scrollTop+f.clientHeight&&(f.scrollTop=c+e-f.clientHeight);var g=f.offsetLeft,h=f.offsetTop;if(f.parentNode!=f.offsetParent){g-=f.parentNode.offsetLeft;h-=f.parentNode.offsetTop}b+=g-f.scrollLeft;c+=h-f.scrollTop;f=f.parentNode}}\nfunction g0b(a){var b,c,d,e,f;c=(Sxb(),a.tb).style;c[ZYe]=(xy(),'100.0%');c[YYe]='100.0%';c[BZe]=(dy(),CZe);c[H_e]=G_e;c[k$e]=G_e;c[K_e]='10000';a.k.className='material-cutout-focus';c=a.k.style;c[A3e]=\"''\";c[BZe]=DZe;c[K_e]='-1';if(!a.o){throw tvb(new YLe('The target element should be set before calling open().'))}Ss(a.o);a.g==null&&(d=new qSb(Mt($doc)),DRb(d,a.d),e=d.tb.style,e[BZe]=CZe,undefined,e[ZYe]='1.0px',undefined,e[YYe]='1.0px',undefined,e[k$e]='-10.0px',undefined,e[H_e]='-10.0px',undefined,e[K_e]='-10000',undefined,f=wpc(a.d),a.n<1&&MMe(f.substr(0,4),'rgb(')&&(f=RMe(RMe(f,'rgb(','rgba('),')',', '+a.n+')')),a.g=f,undefined);b=$doc.documentElement.style;a.p=(dt(),b)[F_e];b[F_e]=q$e;a.e==null&&(a.e=(FQb==null&&(FQb=$wnd.$(zZe)),FQb).width()+300+v$e);k0b(a);if(a.a){a.k.style[Llf]='0px 0px 0px 0rem '+a.g;Hr((Ar(),zr),new n0b(a))}else{a.k.style[Llf]=Mlf+a.e+' '+a.g}if(a.f){a.k.style[Nlf]=wcf;a.k.style[Olf]=wcf;a.k.style[Plf]='49.9%';a.k.style[Qlf]='49.9%'}else{a.k.style[Nlf]='';a.k.style[Olf]='';a.k.style[Plf]='';a.k.style[Qlf]=''}j0b(a.k,a.o,a.i,a.f);BRb(a,Myb(new p0b(a)));BRb(a,Nyb(new r0b(a)));a.tb.style[J_e]='';if(!a.sb){a.c=true;gAb((ZEb(),bFb(null)),a)}DB(a,a)}\nfunction VCd(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;b=new ukc;IQb(b,(c=new s7b,IQb(c,(e=new Ymd,Ws(ho(e.a),(kxb(),(new $wb(lxb(E8e))).a)),SB(e,E8e),e)),IQb(c,(f=new pAe,kqd(f,(g=new kNe,g.a+='\\u2003&lt;!-- Addin Import --&gt;<br> xmlns:ma=\"urn:import:gwt.material.design.addins.client\"<br><br> &lt;!-- Addin Usage --&gt;<br> &lt;ma:cutout.MaterialCutOut ui:field=\"cutout\" backgroundColor=\"BLUE\" circle=\"true\" opacity=\"0.8\" textAlign=\"CENTER\"&gt;<br> \\u2003&lt;m:MaterialTitle title=\"New Feature\" description=\"Description of your new Feature\" textColor=\"WHITE\"/&gt;<br> \\u2003&lt;m:MaterialButton text=\"Close\" ui:field=\"btnCutOutClose\" textColor=\"BLUE\" backgroundColor=\"WHITE\"/&gt;<br> &lt;/ma:cutout.MaterialCutOut&gt;',new Uwb(g.a)).a),zo((Sxb(),f.tb),F8e,true),f)),zo(c.tb,U4e,true),c));IQb(b,(d=new s7b,IQb(d,(h=new Ymd,iqd(h.b,'Click the icon below to show a material cutout.'),Ws(ho(h.a),(new $wb(lxb(Tlf))).a),SB(h,Tlf),h)),IQb(d,(i=new ehd,chd(i,(bUc(),QOc)),MQb(i,a.a),a.c.a=i,i)),IQb(d,(j=new l0b,IQb(j,(k=new Ymd,iqd(k.b,'Description of your new Feature'),Ws(ho(k.a),(new $wb(lxb(Ulf))).a),SB(k,Ulf),gSb(k,(Ozc(),zzc)),k)),IQb(j,(l=new MXb,DRb(l,zzc),TYb(l.k,Z8e),l.k.ob||IQb(l,l.k),gSb(l,nvc),MQb(l,a.b),l)),fSb(j,(bWc(),ZVc)),j.n=0.8,j.g=null,j.f=true,a.c.b=j,j)),IQb(d,(m=new pAe,kqd(m,(n=new kNe,n.a+='\\u2003&lt; -- Target Element --&gt;<br> &lt;m:MaterialIcon iconType=\"POLYMER\" ui:field=\"btnCutOut\"/&gt;<br> &lt;ma:cutout.MaterialCutOut ui:field=\"cutout\" backgroundColor=\"BLUE\" circle=\"true\" opacity=\"0.8\" textAlign=\"CENTER\"&gt;<br> \\u2003&lt;m:MaterialTitle title=\"New Feature\" description=\"Description of your new Feature\" textColor=\"WHITE\"/&gt;<br> \\u2003&lt;m:MaterialButton text=\"Close\" ui:field=\"btnCutOutClose\" textColor=\"BLUE\" backgroundColor=\"WHITE\"/&gt;<br> &lt;/ma:cutout.MaterialCutOut&gt;<br>',new Uwb(n.a)).a),zo(m.tb,F8e,true),m)),IQb(d,(o=new pAe,kqd(o,(p=new kNe,p.a+='\\u2003@UiField MaterialCutOut cutout;<br><br>  &lt;-- Target Element --&gt;<br> @UiField MaterialIcon btnCutOut; <br><br>  @UiHandler(\"btnCutOut\")<br> void onCutOut(ClickEvent e){<br> \\u2003cutout.setTarget(btnCutOut);<br> \\u2003cutout.open();<br> }',new Uwb(p.a)).a),zo(o.tb,K8e,true),o)),zo(d.tb,U4e,true),d));return b}\nvar Llf='boxShadow',Mlf='0px 0px 0px ',Nlf='WebkitBorderRadius',Olf='borderRadius',Plf='webkitBorderTopLeftRadius',Qlf='borderTopLeftRadius',Rlf='box-shadow ',Slf='gwt.material.design.addins.client.cutout',Tlf='Material Cut Out',Ulf='New Feature';var Jyb=false;Svb(771,y$e,{},jzb);_.hd=function kzb(a){f0b(hF(a,3030).a)};_.jd=function lzb(){return hzb};var hzb;var DK=qLe(oYe,'Window/ScrollEvent',771);Svb(2304,26,u1e,l0b);_.Te=function m0b(a){this.d=a;this.g=null};_.a=false;_.c=false;_.f=false;_.i=0;_.j=0;_.n=0;var bP=qLe(Slf,'MaterialCutOut',2304);Svb(2305,1,{},n0b);_.$c=function o0b(){d0b(this.a)};var $O=qLe(Slf,'MaterialCutOut/lambda$0$Type',2305);Svb(2306,1,v0e,p0b);_.zd=function q0b(a){e0b(this.a)};var _O=qLe(Slf,'MaterialCutOut/lambda$1$Type',2306);Svb(2307,1,{8:1,3030:1},r0b);var aP=qLe(Slf,'MaterialCutOut/lambda$2$Type',2307);Svb(969,56,V0e,JCd);_.Fe=function KCd(){Qze();kKb(this,new Sze('CutOuts','The MaterialCutOut is an excellent component to show users about new features and important components (buttons, labels and so) on the UI.','addins/cutouts/CutOutsView',''))};var K2=qLe(_9e,'CutOutsPresenter',969);Svb(1333,65,W0e,QCd);var Q2=qLe(_9e,'CutOutsView',1333);Svb(1334,1,B0e,RCd);_.xd=function SCd(a){bnd(new end(xE(rE(_L,1),FYe,21,0,[])),'Close Event Fired',R1e,null)};var L2=qLe(_9e,'CutOutsView/lambda$0$Type',1334);Svb(1335,1,D5e,TCd);_.yd=function UCd(a){bnd(new end(xE(rE(_L,1),FYe,21,0,[])),'Open Event Fired',R1e,null)};var M2=qLe(_9e,'CutOutsView/lambda$1$Type',1335);Svb(1871,1,{},WCd);var P2=qLe(_9e,'CutOutsView_BinderImpl/Widgets',1871);Svb(1872,1,E1e,XCd);_.od=function YCd(a){g0b(this.a.c.b)};var N2=qLe(_9e,'CutOutsView_BinderImpl/Widgets/1',1872);Svb(1873,1,E1e,ZCd);_.od=function $Cd(a){c0b(this.a.c.b)};var O2=qLe(_9e,'CutOutsView_BinderImpl/Widgets/2',1873);Svb(807,1,a9e);_.Yc=function hDd(){COb(this.b,aDd(this.a.a))};eYe(Kq)(7);\n//# sourceURL=gwtmaterialdemo-7.js\n")
