$wnd.gwtmaterialdemo.runAsyncCallback7("function FCd(){}\nfunction HCd(){}\nfunction jzb(){izb()}\nfunction h0b(a,b){a.o=b}\nfunction n0b(a){this.a=a}\nfunction p0b(a){this.a=a}\nfunction r0b(a){this.a=a}\nfunction LCd(a){this.a=a}\nfunction NCd(a){this.a=a}\nfunction Ss(a){ot((dt(),a))}\nfunction Pyb(a){!!Fyb&&$B(Fyb,a)}\nfunction e0b(a){j0b(a.k,a.o,a.i,a.f)}\nfunction f0b(a){j0b(a.k,a.o,a.i,a.f)}\nfunction i0b(a,b){h0b(a,(Sxb(),b.tb))}\nfunction izb(){izb=Tvb;hzb=new Xz}\nfunction Syb(){if(!Jyb){Lzb();Jyb=true}}\nfunction d0b(a){a.k.style[Nlf]=Olf+a.e+' '+a.g}\nfunction RCd(a){var b;if(!a.d){b=new ECd;a.d=b}return a.d}\nfunction KCd(a){this.a=new LCd(this);this.b=new NCd(this);this.c=a}\nfunction xCd(a,b,c){dKb();CKb.call(this,a,b,c,(Ytd(),Wtd))}\nfunction Nyb(a){Qyb();Syb();return Lyb((izb(),izb(),hzb),a)}\nfunction Lzb(){var b=$wnd.onscroll;$wnd.onscroll=kYe(function(a){try{Jyb&&Pyb((su($doc),tu($doc),new jzb))}finally{b&&b(a)}})}\nfunction QCd(a){var b,c;if(!a.c){c=new xCd(qHb(kLb(a.a)),(b=RCd(a),b),PCd(a));XJb((nLb(a.a),c),lNb(nLb(a.a)));a.c=c}return a.c}\nfunction k0b(a){if(a.a){a.k.style[x1e]=Tlf+a.j+'ms '+a.b;a.k.style[y1e]=Tlf+a.j+'ms '+a.b}else{a.k.style[x1e]='';a.k.style[y1e]=''}}\nfunction c0b(a){$doc.documentElement.style[L_e]=a.p;(Sxb(),a.tb).style[P_e]=(vw(),gZe);!a.Y&&(a.Y=new M3c(a));J3c(a.Y);if(a.c){Mo(a);a.c=false}yB(a,a)}\nfunction ECd(){UKb.call(this);SKb(this,JCd(new KCd(this)));Rtd(this.b);Go(this.b,new FCd,vB?vB:(vB=new Xz));Go(this.b,new HCd,(!AB&&(AB=new Xz),AB));i0b(this.b,this.a)}\nfunction l0b(){rSb.call(this,Mt($doc),xE(rE(ntb,1),_$e,2,6,['material-cutout']));this.d=(Kzc(),jvc);this.i=10;this.n=0.8;this.a=true;this.b='ease';this.f=false;this.c=false;this.j=500;this.k=Mt($doc);rs((Sxb(),this.tb),this.k);this.tb.style[L_e]=(Qx(),w$e);this.tb.style[P_e]=(vw(),gZe)}\nfunction j0b(a,b,c,d){var e,f,g,h,i;h=((b.offsetTop||0)|0)-$wnd.Math.max($wnd.$('html').scrollTop(),$wnd.$(FZe).scrollTop());g=yt((dt(),ct),b);i=(b.offsetWidth||0)|0;f=(b.offsetHeight||0)|0;if(d){if(i!=f){e=i-f;if(i>f){f+=e;h-=e/2}else{e=-e;i+=e;g-=e/2}}}h-=c;g-=c;i+=c*2;f+=c*2;$wnd.$(a).css(N_e,h+B$e);$wnd.$(a).css(q$e,g+B$e);$wnd.$(a).css(dZe,i+B$e);$wnd.$(a).css(cZe,f+B$e)}\nfunction ot(a){var b=a.offsetLeft,c=a.offsetTop;var d=a.offsetWidth,e=a.offsetHeight;if(a.parentNode!=a.offsetParent){b-=a.parentNode.offsetLeft;c-=a.parentNode.offsetTop}var f=a.parentNode;while(f&&f.nodeType==1){b<f.scrollLeft&&(f.scrollLeft=b);b+d>f.scrollLeft+f.clientWidth&&(f.scrollLeft=b+d-f.clientWidth);c<f.scrollTop&&(f.scrollTop=c);c+e>f.scrollTop+f.clientHeight&&(f.scrollTop=c+e-f.clientHeight);var g=f.offsetLeft,h=f.offsetTop;if(f.parentNode!=f.offsetParent){g-=f.parentNode.offsetLeft;h-=f.parentNode.offsetTop}b+=g-f.scrollLeft;c+=h-f.scrollTop;f=f.parentNode}}\nfunction g0b(a){var b,c,d,e,f;c=(Sxb(),a.tb).style;c[dZe]=(xy(),'100.0%');c[cZe]='100.0%';c[HZe]=(dy(),IZe);c[N_e]=M_e;c[q$e]=M_e;c[Q_e]='10000';a.k.className='material-cutout-focus';c=a.k.style;c[G3e]=\"''\";c[HZe]=JZe;c[Q_e]='-1';if(!a.o){throw tvb(new cMe('The target element should be set before calling open().'))}Ss(a.o);a.g==null&&(d=new qSb(Mt($doc)),DRb(d,a.d),e=d.tb.style,e[HZe]=IZe,undefined,e[dZe]='1.0px',undefined,e[cZe]='1.0px',undefined,e[q$e]='-10.0px',undefined,e[N_e]='-10.0px',undefined,e[Q_e]='-10000',undefined,f=spc(a.d),a.n<1&&SMe(f.substr(0,4),'rgb(')&&(f=XMe(XMe(f,'rgb(','rgba('),')',', '+a.n+')')),a.g=f,undefined);b=$doc.documentElement.style;a.p=(dt(),b)[L_e];b[L_e]=w$e;a.e==null&&(a.e=(FQb==null&&(FQb=$wnd.$(FZe)),FQb).width()+300+B$e);k0b(a);if(a.a){a.k.style[Nlf]='0px 0px 0px 0rem '+a.g;Hr((Ar(),zr),new n0b(a))}else{a.k.style[Nlf]=Olf+a.e+' '+a.g}if(a.f){a.k.style[Plf]=ycf;a.k.style[Qlf]=ycf;a.k.style[Rlf]='49.9%';a.k.style[Slf]='49.9%'}else{a.k.style[Plf]='';a.k.style[Qlf]='';a.k.style[Rlf]='';a.k.style[Slf]=''}j0b(a.k,a.o,a.i,a.f);BRb(a,Myb(new p0b(a)));BRb(a,Nyb(new r0b(a)));a.tb.style[P_e]='';if(!a.sb){a.c=true;gAb((ZEb(),bFb(null)),a)}DB(a,a)}\nfunction JCd(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;b=new ukc;IQb(b,(c=new s7b,IQb(c,(e=new Mmd,Ws(ho(e.a),(kxb(),(new $wb(lxb(G8e))).a)),SB(e,G8e),e)),IQb(c,(f=new vAe,$pd(f,(g=new qNe,g.a+='\\u2003&lt;!-- Addin Import --&gt;<br> xmlns:ma=\"urn:import:gwt.material.design.addins.client\"<br><br> &lt;!-- Addin Usage --&gt;<br> &lt;ma:cutout.MaterialCutOut ui:field=\"cutout\" backgroundColor=\"BLUE\" circle=\"true\" opacity=\"0.8\" textAlign=\"CENTER\"&gt;<br> \\u2003&lt;m:MaterialTitle title=\"New Feature\" description=\"Description of your new Feature\" textColor=\"WHITE\"/&gt;<br> \\u2003&lt;m:MaterialButton text=\"Close\" ui:field=\"btnCutOutClose\" textColor=\"BLUE\" backgroundColor=\"WHITE\"/&gt;<br> &lt;/ma:cutout.MaterialCutOut&gt;',new Uwb(g.a)).a),zo((Sxb(),f.tb),H8e,true),f)),zo(c.tb,Z4e,true),c));IQb(b,(d=new s7b,IQb(d,(h=new Mmd,Ypd(h.b,'Click the icon below to show a material cutout.'),Ws(ho(h.a),(new $wb(lxb(Vlf))).a),SB(h,Vlf),h)),IQb(d,(i=new ehd,chd(i,(ZTc(),MOc)),MQb(i,a.a),a.c.a=i,i)),IQb(d,(j=new l0b,IQb(j,(k=new Mmd,Ypd(k.b,'Description of your new Feature'),Ws(ho(k.a),(new $wb(lxb(Wlf))).a),SB(k,Wlf),gSb(k,(Kzc(),vzc)),k)),IQb(j,(l=new MXb,DRb(l,vzc),TYb(l.k,_8e),l.k.ob||IQb(l,l.k),gSb(l,jvc),MQb(l,a.b),l)),fSb(j,(ZVc(),VVc)),j.n=0.8,j.g=null,j.f=true,a.c.b=j,j)),IQb(d,(m=new vAe,$pd(m,(n=new qNe,n.a+='\\u2003&lt; -- Target Element --&gt;<br> &lt;m:MaterialIcon iconType=\"POLYMER\" ui:field=\"btnCutOut\"/&gt;<br> &lt;ma:cutout.MaterialCutOut ui:field=\"cutout\" backgroundColor=\"BLUE\" circle=\"true\" opacity=\"0.8\" textAlign=\"CENTER\"&gt;<br> \\u2003&lt;m:MaterialTitle title=\"New Feature\" description=\"Description of your new Feature\" textColor=\"WHITE\"/&gt;<br> \\u2003&lt;m:MaterialButton text=\"Close\" ui:field=\"btnCutOutClose\" textColor=\"BLUE\" backgroundColor=\"WHITE\"/&gt;<br> &lt;/ma:cutout.MaterialCutOut&gt;<br>',new Uwb(n.a)).a),zo(m.tb,H8e,true),m)),IQb(d,(o=new vAe,$pd(o,(p=new qNe,p.a+='\\u2003@UiField MaterialCutOut cutout;<br><br>  &lt;-- Target Element --&gt;<br> @UiField MaterialIcon btnCutOut; <br><br>  @UiHandler(\"btnCutOut\")<br> void onCutOut(ClickEvent e){<br> \\u2003cutout.setTarget(btnCutOut);<br> \\u2003cutout.open();<br> }',new Uwb(p.a)).a),zo(o.tb,M8e,true),o)),zo(d.tb,Z4e,true),d));return b}\nvar Nlf='boxShadow',Olf='0px 0px 0px ',Plf='WebkitBorderRadius',Qlf='borderRadius',Rlf='webkitBorderTopLeftRadius',Slf='borderTopLeftRadius',Tlf='box-shadow ',Ulf='gwt.material.design.addins.client.cutout',Vlf='Material Cut Out',Wlf='New Feature';var Jyb=false;Svb(768,E$e,{},jzb);_.hd=function kzb(a){f0b(hF(a,3030).a)};_.jd=function lzb(){return hzb};var hzb;var DK=wLe(uYe,'Window/ScrollEvent',768);Svb(2304,26,A1e,l0b);_.Te=function m0b(a){this.d=a;this.g=null};_.a=false;_.c=false;_.f=false;_.i=0;_.j=0;_.n=0;var bP=wLe(Ulf,'MaterialCutOut',2304);Svb(2305,1,{},n0b);_.$c=function o0b(){d0b(this.a)};var $O=wLe(Ulf,'MaterialCutOut/lambda$0$Type',2305);Svb(2306,1,B0e,p0b);_.zd=function q0b(a){e0b(this.a)};var _O=wLe(Ulf,'MaterialCutOut/lambda$1$Type',2306);Svb(2307,1,{8:1,3030:1},r0b);var aP=wLe(Ulf,'MaterialCutOut/lambda$2$Type',2307);Svb(966,56,_0e,xCd);_.Fe=function yCd(){Wze();kKb(this,new Yze('CutOuts','The MaterialCutOut is an excellent component to show users about new features and important components (buttons, labels and so) on the UI.','addins/cutouts/CutOutsView',''))};var H2=wLe(baf,'CutOutsPresenter',966);Svb(1330,65,a1e,ECd);var N2=wLe(baf,'CutOutsView',1330);Svb(1331,1,H0e,FCd);_.xd=function GCd(a){Rmd(new Umd(xE(rE(_L,1),LYe,21,0,[])),'Close Event Fired',X1e,null)};var I2=wLe(baf,'CutOutsView/lambda$0$Type',1331);Svb(1332,1,H5e,HCd);_.yd=function ICd(a){Rmd(new Umd(xE(rE(_L,1),LYe,21,0,[])),'Open Event Fired',X1e,null)};var J2=wLe(baf,'CutOutsView/lambda$1$Type',1332);Svb(1868,1,{},KCd);var M2=wLe(baf,'CutOutsView_BinderImpl/Widgets',1868);Svb(1869,1,K1e,LCd);_.od=function MCd(a){g0b(this.a.c.b)};var K2=wLe(baf,'CutOutsView_BinderImpl/Widgets/1',1869);Svb(1870,1,K1e,NCd);_.od=function OCd(a){c0b(this.a.c.b)};var L2=wLe(baf,'CutOutsView_BinderImpl/Widgets/2',1870);Svb(804,1,c9e);_.Yc=function XCd(){COb(this.b,QCd(this.a.a))};kYe(Kq)(7);\n//# sourceURL=gwtmaterialdemo-7.js\n")