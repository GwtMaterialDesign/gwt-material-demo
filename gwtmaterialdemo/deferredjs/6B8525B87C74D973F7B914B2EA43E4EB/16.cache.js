$wnd.gwtmaterialdemo.runAsyncCallback16("function ycc(){}\nfunction Dcc(){}\nfunction TKd(){}\nfunction VKd(a){this.a=a}\nfunction XKd(a){this.a=a}\nfunction Acc(a){this.a=a}\nfunction Gcc(){Gcc=Dub;Ccc=new Dcc}\nfunction cLd(a){var b;if(!a.d){b=new SKd;a.d=b}return a.d}\nfunction QKd(a){Hmd(Nmd(new Omd,(rod(),Xnd)),a.b,null)}\nfunction RKd(a){Hmd(Nmd(new Omd,(rod(),wnd)),a.a,null)}\nfunction JKd(a,b,c){IKd();pJb.call(this,a,b,c,(Lsd(),Jsd))}\nfunction $Kd(a){this.c=a;this.a=lt($doc);this.b=new lwb(this.a)}\nfunction zcc(a,b){wcc();var c;c=new ycc;c.b=a;c.a=b;c.c=100;xcc(c)}\nfunction wcc(){wcc=Dub;!qPb&&(qPb=new rPb);Ujc();Yjc((Gcc(),Ccc),true,false)}\nfunction _Kd(a){var b;b=new dMe;b.a+=w6e;cMe(b,Xvb(a));b.a+=z6e;return new Evb(b.a)}\nfunction bLd(a){var b,c;if(!a.c){c=new JKd(dGb(ZJb(a.a)),(b=cLd(a),b),aLd(a));KIb((aKb(a.a),c),$Lb(aKb(a.a)));a.c=c}return a.c}\nfunction xcc(a){var b;if(a.b){b=(Cwb(),lt($doc));Hs(a.b,b);$wnd.apply('#'+b,a.c,Eub(Acc.prototype.Ff,Acc,[a.a]))}else{new QKe;os()}}\nfunction SKd(){HJb.call(this);FJb(this,ZKd(new $Kd(this)));wcc();zcc(ho(this.c),Eub(TKd.prototype.Ff,TKd,[]));zcc(ho(this.b),Eub(VKd.prototype.Ff,VKd,[this]));zcc(ho(this.a),Eub(XKd.prototype.Ff,XKd,[this]))}\nfunction ZKd(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r;c=new MAb(_Kd(a.a).a);b=nwb((Cwb(),c.tb));kwb(a.b);b.b?rs(b.b,b.a,b.c):pwb(b.a);KAb(c,(d=new f6b,vPb(d,(e=new zld,Lod(e.b,''),Is(ho(e.a),(Wvb(),(new Kvb(Xvb(y7e))).a)),GA(e,y7e),e)),vPb(d,(f=new hjc,a.c.c=f,f)),vPb(d,(g=new ize,Nod(g,(h=new dMe,h.a+='\\u2003MaterialScrollfire.apply(panel.getElement(), () -&gt; { <br> \\u2003MaterialToast.fireToast(\"Toasted\"); <br> }); <br> MaterialScrollfire.apply(listContainer.getElement(), () -&gt; { <br> \\u2003MaterialAnimator.animate(Transition.SHOW_STAGGERED_LIST, listContainer, 0); <br> }); <br> MaterialScrollfire.apply(image.getElement(), () -&gt; { <br> \\u2003MaterialAnimator.animate(Transition.FADE_IN_IMAGE, image, 0); <br> });',new Evb(h.a)).a),zo(g.tb,E7e,true),g)),vPb(d,(i=new A9b,z9b(i,(j=new Ljd,vPb(j,(k=new zld,Lod(k.b,Wbf),Is(ho(k.a),(new Kvb(Xvb(Wbf))).a),GA(k,Wbf),k)),j.tb.style.opacity=0,j)),z9b(i,(l=new Ljd,vPb(l,(m=new zld,Lod(m.b,Wbf),Is(ho(m.a),(new Kvb(Xvb(Wbf))).a),GA(m,Wbf),m)),l.tb.style.opacity=0,l)),z9b(i,(n=new Ljd,vPb(n,(o=new zld,Lod(o.b,Wbf),Is(ho(o.a),(new Kvb(Xvb(Wbf))).a),GA(o,Wbf),o)),n.tb.style.opacity=0,n)),z9b(i,(p=new Ljd,vPb(p,(q=new zld,Lod(q.b,Wbf),Is(ho(q.a),(new Kvb(Xvb(Wbf))).a),GA(q,Wbf),q)),p.tb.style.opacity=0,p)),a.c.b=i,i)),vPb(d,(r=new _ic,r.tb.setAttribute(Ybf,Zbf),r.tb.style.opacity=0,r.ob?Xic(r,u6e):oQb(r,Go(r,new bjc(r,u6e),(!eA&&(eA=new Ly),eA))),QZb(r,Qmf,true),a.c.a=r,r)),zo(d.tb,R3e,true),d),kwb(a.b));return c}\nvar Pmf='gwt.material.design.addins.client.scrollfire';Cub(2332,1,{},ycc);_.c=100;var PP=jKe(Pmf,'MaterialScrollfire',2332);Cub(3201,$wnd.Function,{},Acc);_.Ff=function Bcc(){this.a.call(null)};var Ccc;Cub(2466,1,{},Dcc);_.Jd=function Ecc(){return 'scrollfireJs'};_.Kd=function Fcc(){return 'function apply(selector, offset, callback) {var didScroll = false; var done = false; var callbacks = $.Callbacks(); window.addEventListener(\"scroll\", function() {didScroll = true; }); setInterval(function() {if(didScroll) {didScroll = false; var windowScroll = window.pageYOffset + window.innerHeight; var currentElement = document.querySelector(selector); if ( currentElement !== null) {var elementOffset = currentElement.getBoundingClientRect().top + window.pageYOffset; if (windowScroll > (elementOffset + offset)) {if (done !== true) {callbacks.add(callback); callbacks.fire(); done = true; } } } } }, 100); }'};var OP=jKe(Pmf,'MaterialScrollfireClientBundle_default_InlineClientBundleGenerator/1',2466);Cub(980,56,P_e,JKd);_.De=function KKd(){Jye();ZIb(this,new Lye('Scrollfire',\"Executes callback functions depending on how far into the page you've scrolled.\",'addins/scrollfire/ScrollFireView',''))};var d5=jKe(kaf,'ScrollFirePresenter',980);Cub(1384,65,Q_e,SKd);var f5=jKe(kaf,'ScrollFireView',1384);Cub(3102,$wnd.Function,{},TKd);_.Ff=function UKd(){Eld(new Hld(lD(fD(LK,1),yXe,21,0,[])),'Toasted',L0e,null)};Cub(3103,$wnd.Function,{},VKd);_.Ff=function WKd(){QKd(this.a)};Cub(3104,$wnd.Function,{},XKd);_.Ff=function YKd(){RKd(this.a)};Cub(1931,1,{},$Kd);var e5=jKe(kaf,'ScrollFireView_BinderImpl/Widgets',1931);Cub(827,1,W7e);_.Yc=function iLd(){pNb(this.b,bLd(this.a.a))};ZWe(Jq)(16);\n//# sourceURL=gwtmaterialdemo-16.js\n")