$wnd.gwtmaterialdemo.runAsyncCallback10("function QFd(){}\nfunction SFd(a){this.a=a}\nfunction UFd(a){this.a=a}\nfunction WFd(a){this.a=a}\nfunction YFd(a){this.a=a}\nfunction $Fd(a){this.a=a}\nfunction aGd(a){this.a=a}\nfunction cGd(a){this.a=a}\nfunction eGd(a){this.a=a}\nfunction gGd(a){this.a=a}\nfunction G6b(a){this.a=a}\nfunction W5b(a){return E6b(a.a,a.b)}\nfunction _5b(){J5b();Q5b.call(this)}\nfunction d6b(){J5b();Q5b.call(this)}\nfunction u6b(){J5b();Q5b.call(this)}\nfunction y6b(){J5b();Q5b.call(this)}\nfunction GFd(a,b,c){dKb();CKb.call(this,a,b,c,(iud(),gud))}\nfunction NFd(){UKb.call(this);SKb(this,OFd(new PFd(this)))}\nfunction kGd(a){var b;if(!a.d){b=new NFd;a.d=b}return a.d}\nfunction $5b(a){q5b(a,HLe($wnd.$(ho(a.G)).cleanVal()),false)}\nfunction t6b(a){q5b(a,gMe(ILe($wnd.$(ho(a.G)).cleanVal())),false)}\nfunction x6b(a){q5b(a,rMe(JLe($wnd.$(ho(a.G)).cleanVal())),false)}\nfunction c6b(a){q5b(a,new OLe(SLe($wnd.$(ho(a.G)).cleanVal())),false)}\nfunction Y5b(){J5b();Q5b.call(this);this.b=wmf;this.a=new G6b(this);X5b(this,this.b)}\nfunction X5b(a,b){var c;a.b=b;c=RMe(RMe(RMe(b.toLowerCase(),'m','0'),'d','0'),'y','0');a.c=c}\nfunction E6b(a,b){if(D6b(a,b)){a5b(a.a);return hD((zD(),BD(b,KD((JD(),JD(),ID)))),Js(ho(a.a.G),D0e))}return null}\nfunction jGd(a){var b,c;if(!a.c){c=new GFd(qHb(kLb(a.a)),(b=kGd(a),b),iGd(a));XJb((nLb(a.a),c),lNb(nLb(a.a)));a.c=c}return a.c}\nfunction SLe(a){var b;b=HLe(a);if(b>3.4028234663852886E38){return Infinity}else if(b<-3.4028234663852886E38){return -Infinity}return b}\nfunction PFd(a){this.a=new QFd;this.c=new UFd(this);this.d=new WFd(this);this.e=new YFd(this);this.f=new $Fd(this);this.g=new aGd(this);this.i=new cGd(this);this.j=new eGd(this);this.k=new gGd(this);this.b=new SFd(this);this.n=a}\nfunction F6b(a,b,c){return !(MMe(a,'31')&&(MMe(b,'4')||MMe(b,'6')||MMe(b,'9')||MMe(b,'11')||MMe(b,'04')||MMe(b,'06')||MMe(b,'09')))&&(!(MMe(b,'2')||MMe(b,'02'))||(c%4==0?!MMe(a,'30')&&!MMe(a,'31'):!MMe(a,'29')&&!MMe(a,'30')&&!MMe(a,'31')))}\nfunction DMe(){DMe=Tvb;var a;zMe=xE(rE(CF,1),oZe,116,15,[-1,-1,30,19,15,13,11,11,10,9,9,8,8,8,8,7,7,7,7,7,7,7,6,6,6,6,6,6,6,6,6,6,6,6,6,6,5]);AMe=tE(CF,oZe,116,37,15,1);BMe=xE(rE(CF,1),oZe,116,15,[-1,-1,63,40,32,28,25,23,21,20,19,19,18,18,17,17,16,16,16,15,15,15,15,14,14,14,14,14,14,13,13,13,13,13,13,13,13]);CMe=tE(DF,rZe,116,37,14,1);for(a=2;a<=36;a++){AMe[a]=zF($wnd.Math.pow(a,zMe[a]));CMe[a]=xvb({l:y_e,m:y_e,h:524287},AMe[a])}}\nfunction D6b(a,b){var c,d,e,f,g;if(Js(ho(a.a.G),D0e)!=null&&Js(ho(a.a.G),D0e).length!=0&&a.a.c!=null&&b!=null){c=Js(ho(a.a.G),D0e);e=XMe(c,b.indexOf('M'),b.indexOf('M/')+1);d=XMe(c,b.indexOf('d'),b.indexOf('d/')+1);g=XMe(c,b.indexOf('y'),b.lastIndexOf('y')+1);f=F6b(d,e,ILe(g));f||h5b(a.a,'Not a valid date');return h5b(a.a,'Month does not match'),(new RegExp('^(^(0?[1-9]|1[012])$)$')).test(e)&&(h5b(a.a,'Day does not match'),(new RegExp('^((0?[1-9]|[12][0-9]|3[01]))$')).test(d))&&(h5b(a.a,'Year does not match'),(new RegExp('^(^\\\\d{4}$)$')).test(g))&&f}h5b(a.a,'Text input must not be empty or null');return false}\nfunction JLe(a){var b,c,d,e,f,g,h,i,j,k,l;if(a==null){throw tvb(new EMe(MYe))}j=a;f=a.length;i=false;if(f>0){b=(TXe(0,a.length),a.charCodeAt(0));if(b==45||b==43){a=a.substr(1);--f;i=b==45}}if(f==0){throw tvb(new EMe(ikf+j+'\"'))}while(a.length>0&&(TXe(0,a.length),a.charCodeAt(0)==48)){a=a.substr(1);--f}if(f>(DMe(),BMe)[10]){throw tvb(new EMe(ikf+j+'\"'))}for(e=0;e<f;e++){if(jLe((TXe(e,a.length),a.charCodeAt(e)))==-1){throw tvb(new EMe(ikf+j+'\"'))}}l=0;g=zMe[10];k=AMe[10];h=Evb(CMe[10]);c=true;d=f%g;if(d>0){l=-parseInt(a.substr(0,d),10);a=a.substr(d);f-=d;c=false}while(f>=g){d=parseInt(a.substr(0,g),10);a=a.substr(g);f-=g;if(c){c=false}else{if(vvb(l,h)<0){throw tvb(new EMe(ikf+j+'\"'))}l=Dvb(l,k)}l=Fvb(l,d)}if(vvb(l,0)>0){throw tvb(new EMe(ikf+j+'\"'))}if(!i){l=Evb(l);if(vvb(l,0)<0){throw tvb(new EMe(ikf+j+'\"'))}}return l}\nfunction OFd(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,$,ab,bb,cb,db,eb,fb,gb,hb,ib,jb,kb,lb,mb,nb,ob,pb,qb,rb,sb,tb,ub,vb,wb,xb,yb,zb,Ab,Bb;b=new ukc;IQb(b,(c=new s7b,IQb(c,(k=new Ymd,Ws(ho(k.a),(kxb(),(new $wb(lxb(ymf))).a)),SB(k,ymf),k)),IQb(c,(l=new eAe,qXb(l.a,Jlf),sXb(l.a),(Sxb(),l.tb).style[i9e]=(xy(),r9e),tXb(l.a,'jQuery-Mask-Plugin 1.14.10'),l)),IQb(c,(m=new s7b,IQb(m,(n=new B6b,rrc((!n.X&&(n.X=new urc(n)),n.X),y7e),ho(n.G).setAttribute(T2e,'eg: 000-00-0000000'),$pd(n.A).length==0||ro(n.A,h1e),_pd(n.A,'Phone Number'),Es(ho(n.G),T2e).length==0||ro(n.A,h1e),n.c=zmf,n)),IQb(m,(o=new B6b,rrc((!o.X&&(o.X=new urc(o)),o.X),y7e),ho(o.G).setAttribute(T2e,'eg: (00) 0000-0000'),$pd(o.A).length==0||ro(o.A,h1e),_pd(o.A,'Phone with Odd'),Es(ho(o.G),T2e).length==0||ro(o.A,h1e),o.c='(00) 0000-0000',o)),IQb(m,(p=new B6b,rrc((!p.X&&(p.X=new urc(p)),p.X),y7e),ho(p.G).setAttribute(T2e,'eg: (000) 000-000'),$pd(p.A).length==0||ro(p.A,h1e),_pd(p.A,'US Phone Number'),Es(ho(p.G),T2e).length==0||ro(p.A,h1e),p.c='(000) 000-000',p)),m)),IQb(c,(q=new s7b,IQb(q,(r=new B6b,rrc((!r.X&&(r.X=new urc(r)),r.X),y7e),ho(r.G).setAttribute(T2e,'eg: 00000-000'),$pd(r.A).length==0||ro(r.A,h1e),_pd(r.A,'CEP'),Es(ho(r.G),T2e).length==0||ro(r.A,h1e),r.c='00000-000',r)),IQb(q,(s=new B6b,rrc((!s.X&&(s.X=new urc(s)),s.X),y7e),ho(s.G).setAttribute(T2e,'eg: 000.000.000-00'),$pd(s.A).length==0||ro(s.A,h1e),_pd(s.A,'CPF'),Es(ho(s.G),T2e).length==0||ro(s.A,h1e),s.c='000.000.000-00',s)),IQb(q,(t=new B6b,rrc((!t.X&&(t.X=new urc(t)),t.X),y7e),ho(t.G).setAttribute(T2e,'eg: 000,000,000,000,000.00'),$pd(t.A).length==0||ro(t.A,h1e),_pd(t.A,'Money'),Es(ho(t.G),T2e).length==0||ro(t.A,h1e),t.c='000,000,000,000,000.00',t)),q)),IQb(c,(u=new s7b,IQb(u,(v=new B6b,rrc((!v.X&&(v.X=new urc(v)),v.X),y7e),ho(v.G).setAttribute(T2e,Amf),$pd(v.A).length==0||ro(v.A,h1e),_pd(v.A,Bmf),Es(ho(v.G),T2e).length==0||ro(v.A,h1e),v.c=Cmf,v)),IQb(u,(w=new B6b,rrc((!w.X&&(w.X=new urc(w)),w.X),y7e),ho(w.G).setAttribute(T2e,Dmf),$pd(w.A).length==0||ro(w.A,h1e),_pd(w.A,Emf),Es(ho(w.G),T2e).length==0||ro(w.A,h1e),w.c=Fmf,w)),IQb(u,(A=new B6b,rrc((!A.X&&(A.X=new urc(A)),A.X),y7e),ho(A.G).setAttribute(T2e,Gmf),$pd(A.A).length==0||ro(A.A,h1e),_pd(A.A,Hmf),Es(ho(A.G),T2e).length==0||ro(A.A,h1e),A.c=Imf,A)),u)),IQb(c,(B=new pAe,kqd(B,(C=new kNe,C.a+='\\u2003&lt;m:MaterialRow&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"Phone Number\" placeholder=\"eg: 000-00-0000000\" mask=\"000-00-0000000\" grid=\"s12 m4 l4\"/&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"Phone with Odd\" placeholder=\"eg: (00) 0000-0000\" mask=\"(00) 0000-0000\" grid=\"s12 m4 l4\"/&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"US Phone Number\" placeholder=\"eg: (000) 000-000\" mask=\"(000) 000-000\" grid=\"s12 m4 l4\"/&gt;<br> &lt;/m:MaterialRow&gt;<br> &lt;m:MaterialRow&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"CEP\" placeholder=\"eg: 00000-000\" mask=\"00000-000\" grid=\"s12 m4 l4\"/&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"CPF\" placeholder=\"eg: 000.000.000-00\" mask=\"000.000.000-00\" grid=\"s12 m4 l4\"/&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"Money\" placeholder=\"eg: 000,000,000,000,000.00\" mask=\"000,000,000,000,000.00\" grid=\"s12 m4 l4\"/&gt;<br> &lt;/m:MaterialRow&gt;<br> &lt;m:MaterialRow&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"Ip Address\" placeholder=\"eg: 000.000.000.000\" mask=\"000.000.000.000\" grid=\"s12 m4 l4\"/&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"Percentage\" placeholder=\"eg: 000000.00%\" mask=\"000000.00%\" grid=\"s12 m4 l4\"/&gt;<br> \\u2003&lt;ma:inputmask.MaterialInputMask label=\"Credit Card\" placeholder=\"eg: 0000 0000 0000 0000\" mask=\"0000 0000 0000 0000\" grid=\"s12 m4 l4\"/&gt;<br> &lt;/m:MaterialRow&gt;<br>',new Uwb(C.a)).a),zo(B.tb,F8e,true),B)),zo(c.tb,U4e,true),c));IQb(b,(d=new s7b,IQb(d,(D=new Ymd,iqd(D.b,'The mask will be placed from the right to the left if reverse is true (Default : false)'),Ws(ho(D.a),(new $wb(lxb('Reverse'))).a),SB(D,'Reverse'),D)),IQb(d,(F=new s7b,IQb(F,(G=new B6b,rrc((!G.X&&(G.X=new urc(G)),G.X),y7e),ho(G.G).setAttribute(T2e,Amf),$pd(G.A).length==0||ro(G.A,h1e),_pd(G.A,Bmf),Es(ho(G.G),T2e).length==0||ro(G.A,h1e),G.d.reverse=true,G.c=Cmf,G)),IQb(F,(H=new B6b,rrc((!H.X&&(H.X=new urc(H)),H.X),y7e),ho(H.G).setAttribute(T2e,Dmf),$pd(H.A).length==0||ro(H.A,h1e),_pd(H.A,Emf),Es(ho(H.G),T2e).length==0||ro(H.A,h1e),H.d.reverse=true,H.c=Fmf,H)),IQb(F,(I=new B6b,rrc((!I.X&&(I.X=new urc(I)),I.X),y7e),ho(I.G).setAttribute(T2e,Gmf),$pd(I.A).length==0||ro(I.A,h1e),_pd(I.A,Hmf),Es(ho(I.G),T2e).length==0||ro(I.A,h1e),I.d.reverse=true,I.c=Imf,I)),F)),IQb(d,(J=new pAe,kqd(J,(K=new kNe,K.a+='&lt;ma:inputmask.MaterialInputMask label=\"Ip Address\" placeholder=\"eg: 000.000.000.000\" mask=\"000.000.000.000\" reverse=\"true\" grid=\"s12 m4 l4\"/&gt;<br> &lt;ma:inputmask.MaterialInputMask label=\"Percentage\" placeholder=\"eg: 000000.00%\" mask=\"000000.00%\" reverse=\"true\" grid=\"s12 m4 l4\"/&gt;<br> &lt;ma:inputmask.MaterialInputMask label=\"Credit Card\" placeholder=\"eg: 0000 0000 0000 0000\" mask=\"0000 0000 0000 0000\" reverse=\"true\" grid=\"s12 m4 l4\"/&gt;<br>',new Uwb(K.a)).a),zo(J.tb,F8e,true),J)),zo(d.tb,U4e,true),d));IQb(b,(e=new s7b,IQb(e,(L=new Ymd,iqd(L.b,'The textfield will automatically clears whenever the value is not match with the mask provided. (Default : false)'),Ws(ho(L.a),(new $wb(lxb(Jmf))).a),SB(L,Jmf),L)),IQb(e,(M=new s7b,IQb(M,(N=new B6b,rrc((!N.X&&(N.X=new urc(N)),N.X),y7e),N.d.clearIfNotMatch=true,ho(N.G).setAttribute(T2e,Amf),$pd(N.A).length==0||ro(N.A,h1e),_pd(N.A,Bmf),Es(ho(N.G),T2e).length==0||ro(N.A,h1e),N.c=Cmf,N)),IQb(M,(O=new B6b,rrc((!O.X&&(O.X=new urc(O)),O.X),y7e),O.d.clearIfNotMatch=true,ho(O.G).setAttribute(T2e,Dmf),$pd(O.A).length==0||ro(O.A,h1e),_pd(O.A,Emf),Es(ho(O.G),T2e).length==0||ro(O.A,h1e),O.c=Fmf,O)),IQb(M,(P=new B6b,rrc((!P.X&&(P.X=new urc(P)),P.X),y7e),P.d.clearIfNotMatch=true,ho(P.G).setAttribute(T2e,Gmf),$pd(P.A).length==0||ro(P.A,h1e),_pd(P.A,Hmf),Es(ho(P.G),T2e).length==0||ro(P.A,h1e),P.c=Imf,P)),M)),IQb(e,(Q=new pAe,kqd(Q,(R=new kNe,R.a+='&lt;ma:inputmask.MaterialInputMask label=\"Ip Address\" placeholder=\"eg: 000.000.000.000\" mask=\"000.000.000.000\" clearIfNotMatch=\"true\" grid=\"s12 m4 l4\"/&gt;<br> &lt;ma:inputmask.MaterialInputMask label=\"Percentage\" placeholder=\"eg: 000000.00%\" mask=\"000000.00%\" clearIfNotMatch=\"true\" grid=\"s12 m4 l4\"/&gt;<br> &lt;ma:inputmask.MaterialInputMask label=\"Credit Card\" placeholder=\"eg: 0000 0000 0000 0000\" mask=\"0000 0000 0000 0000\" clearIfNotMatch=\"true\" grid=\"s12 m4 l4\"/&gt;<br>',new Uwb(R.a)).a),zo(Q.tb,F8e,true),Q)),zo(e.tb,U4e,true),e));IQb(b,(f=new s7b,IQb(f,(S=new Ymd,iqd(S.b,'Set whether you want to set on focus on your mask for easy selection.'),Ws(ho(S.a),(new $wb(lxb(Kmf))).a),SB(S,Kmf),S)),IQb(f,(T=new s7b,IQb(T,(U=new B6b,rrc((!U.X&&(U.X=new urc(U)),U.X),y7e),U.d.selectOnFocus=true,ho(U.G).setAttribute(T2e,Amf),$pd(U.A).length==0||ro(U.A,h1e),_pd(U.A,Bmf),Es(ho(U.G),T2e).length==0||ro(U.A,h1e),U.c=Cmf,U)),IQb(T,(V=new B6b,rrc((!V.X&&(V.X=new urc(V)),V.X),y7e),V.d.selectOnFocus=true,ho(V.G).setAttribute(T2e,Dmf),$pd(V.A).length==0||ro(V.A,h1e),_pd(V.A,Emf),Es(ho(V.G),T2e).length==0||ro(V.A,h1e),V.c=Fmf,V)),IQb(T,(W=new B6b,rrc((!W.X&&(W.X=new urc(W)),W.X),y7e),W.d.selectOnFocus=true,ho(W.G).setAttribute(T2e,Gmf),$pd(W.A).length==0||ro(W.A,h1e),_pd(W.A,Hmf),Es(ho(W.G),T2e).length==0||ro(W.A,h1e),W.c=Imf,W)),T)),IQb(f,(X=new pAe,kqd(X,(Y=new kNe,Y.a+='&lt;ma:inputmask.MaterialInputMask label=\"Ip Address\" placeholder=\"eg: 000.000.000.000\" mask=\"000.000.000.000\" selectOnFocus=\"true\" grid=\"s12 m4 l4\"/&gt;<br> &lt;ma:inputmask.MaterialInputMask label=\"Percentage\" placeholder=\"eg: 000000.00%\" mask=\"000000.00%\" selectOnFocus=\"true\" grid=\"s12 m4 l4\"/&gt;<br> &lt;ma:inputmask.MaterialInputMask label=\"Credit Card\" placeholder=\"eg: 0000 0000 0000 0000\" mask=\"0000 0000 0000 0000\" selectOnFocus=\"true\" grid=\"s12 m4 l4\"/&gt;<br>',new Uwb(Y.a)).a),zo(X.tb,F8e,true),X)),zo(f.tb,U4e,true),f));IQb(b,(g=new s7b,IQb(g,(Z=new Ymd,iqd(Z.b,'We supported type safe Input Masks'),Ws(ho(Z.a),(new $wb(lxb('Types'))).a),SB(Z,'Types'),Z)),IQb(g,($=new B6b,rrc((!$.X&&($.X=new urc($)),$.X),G8e),ho($.G).setAttribute(T2e,'eg. A0A-1A1'),$pd($.A).length==0||ro($.A,h1e),_pd($.A,nZe),Es(ho($.G),T2e).length==0||ro($.A,h1e),$.c='S0S-0S0',$4b($,a.a),$)),IQb(g,(ab=new u6b,rrc((!ab.X&&(ab.X=new urc(ab)),ab.X),G8e),_pd(ab.A,'Integer'),Es(ho(ab.G),T2e).length==0||ro(ab.A,h1e),ab.c='000-00-000',$4b(ab,a.c),a.n.e=ab,ab)),IQb(g,(bb=new _5b,rrc((!bb.X&&(bb.X=new urc(bb)),bb.X),G8e),_pd(bb.A,'Double'),Es(ho(bb.G),T2e).length==0||ro(bb.A,h1e),bb.c='000-00-00000',$4b(bb,a.d),a.n.c=bb,bb)),IQb(g,(cb=new d6b,rrc((!cb.X&&(cb.X=new urc(cb)),cb.X),G8e),_pd(cb.A,Lmf),Es(ho(cb.G),T2e).length==0||ro(cb.A,h1e),cb.c='000-00-0000',$4b(cb,a.e),a.n.d=cb,cb)),IQb(g,(db=new y6b,rrc((!db.X&&(db.X=new urc(db)),db.X),G8e),_pd(db.A,'Long'),Es(ho(db.G),T2e).length==0||ro(db.A,h1e),db.c=zmf,$4b(db,a.f),a.n.f=db,db)),IQb(g,(eb=new Y5b,rrc((!eb.X&&(eb.X=new urc(eb)),eb.X),G8e),eb.b=wmf,fb=RMe(RMe(RMe(wmf.toLowerCase(),'m','0'),'d','0'),'y','0'),eb.c=fb,eb.ob?BRb(eb,$4b(eb,new Fmc(eb))):BRb(eb,Go(eb,new Dmc(eb),(!qB&&(qB=new Xz),qB))),_pd(eb.A,x_e),Es(ho(eb.G),T2e).length==0||ro(eb.A,h1e),$4b(eb,a.g),a.n.b=eb,eb)),zo(g.tb,U4e,true),g));IQb(b,(h=new s7b,IQb(h,(gb=new Ymd,iqd(gb.b,'Gets the value of the field with the mask.'),Ws(ho(gb.a),(new $wb(lxb(T8e))).a),SB(gb,T8e),gb)),IQb(h,(hb=new s7b,IQb(hb,(ib=new B6b,rrc((!ib.X&&(ib.X=new urc(ib)),ib.X),y7e),ho(ib.G).setAttribute(T2e,Amf),$pd(ib.A).length==0||ro(ib.A,h1e),_pd(ib.A,Bmf),Es(ho(ib.G),T2e).length==0||ro(ib.A,h1e),ib.d.reverse=true,ib.c=Cmf,a.n.g=ib,ib)),IQb(hb,(jb=new ied,IQb(jb,(kb=new MXb,TYb(kb.k,T8e),kb.k.ob||IQb(kb,kb.k),MQb(kb,a.j),kb)),rrc((!jb.X&&(jb.X=new urc(jb)),jb.X),G8e),jb)),hb)),IQb(h,(lb=new pAe,kqd(lb,(mb=new kNe,mb.a+='inputMask.getValue();',new Uwb(mb.a)).a),zo(lb.tb,K8e,true),lb)),zo(h.tb,U4e,true),h));IQb(b,(i=new s7b,IQb(i,(nb=new Ymd,iqd(nb.b,'Gets the value of the field without the mask.'),Ws(ho(nb.a),(new $wb(lxb(Mmf))).a),SB(nb,Mmf),nb)),IQb(i,(ob=new s7b,IQb(ob,(pb=new B6b,rrc((!pb.X&&(pb.X=new urc(pb)),pb.X),y7e),ho(pb.G).setAttribute(T2e,Amf),$pd(pb.A).length==0||ro(pb.A,h1e),_pd(pb.A,Bmf),Es(ho(pb.G),T2e).length==0||ro(pb.A,h1e),pb.d.reverse=true,pb.c=Cmf,a.n.a=pb,pb)),IQb(ob,(qb=new ied,IQb(qb,(rb=new MXb,TYb(rb.k,Mmf),rb.k.ob||IQb(rb,rb.k),MQb(rb,a.i),rb)),rrc((!qb.X&&(qb.X=new urc(qb)),qb.X),G8e),qb)),ob)),IQb(i,(sb=new pAe,kqd(sb,(tb=new kNe,tb.a+='inputMask.getCleanValue();',new Uwb(tb.a)).a),zo(sb.tb,K8e,true),sb)),zo(i.tb,U4e,true),i));IQb(b,(j=new s7b,IQb(j,(ub=new Ymd,iqd(ub.b,'Programmatically controls the Input Mask main methods.'),Ws(ho(ub.a),(new $wb(lxb(Nmf))).a),SB(ub,Nmf),ub)),IQb(j,(vb=new s7b,IQb(vb,(wb=new B6b,rrc((!wb.X&&(wb.X=new urc(wb)),wb.X),y7e),ho(wb.G).setAttribute(T2e,Amf),$pd(wb.A).length==0||ro(wb.A,h1e),_pd(wb.A,Bmf),Es(ho(wb.G),T2e).length==0||ro(wb.A,h1e),wb.d.reverse=true,wb.c=Cmf,a.n.i=wb,wb)),IQb(vb,(xb=new ied,IQb(xb,(yb=new MXb,yb.tb.style[o1e]=n1e,DRb(yb,(Ozc(),zzc)),TYb(yb.k,'Unmask'),yb.k.ob||IQb(yb,yb.k),gSb(yb,mvc),MQb(yb,a.k),yb)),IQb(xb,(zb=new MXb,TYb(zb.k,'mask'),zb.k.ob||IQb(zb,zb.k),MQb(zb,a.b),zb)),rrc((!xb.X&&(xb.X=new urc(xb)),xb.X),G8e),xb)),vb)),IQb(j,(Ab=new pAe,kqd(Ab,(Bb=new kNe,Bb.a+='\\u2003inputMask.mask(\"00.00\"); <br> inputMask.unmask();',new Uwb(Bb.a)).a),zo(Ab.tb,K8e,true),Ab)),zo(j.tb,U4e,true),j));return b}\nvar wmf='MM/dd/yyyy',ymf='Basic Examples',zmf='000-00-0000000',Amf='eg: 000.000.000.000',Bmf='Ip Address',Cmf='000.000.000.000',Dmf='eg: 000000.00%',Emf='Percentage',Fmf='000000.00%',Gmf='eg: 0000 0000 0000 0000',Hmf='Credit Card',Imf='0000 0000 0000 0000',Jmf='Clear If not Match',Kmf='Select on Focus',Mmf='Get Clean Value',Nmf='Unmask and Mask control';Svb(2661,324,V2e,Y5b);_.Xd=function Z5b(){return E6b(this.a,this.b)};var SP=qLe(xmf,'MaterialDateInputMask',2661);Svb(2658,324,V2e,_5b);_.Xd=function a6b(){return HLe($wnd.$(ho(this.G)).cleanVal())};_.Yd=function b6b(a){var b;$5b((b=this,AF(a),b))};var TP=qLe(xmf,'MaterialDoubleInputMask',2658);Svb(2659,324,V2e,d6b);_.Xd=function e6b(){return new OLe(SLe($wnd.$(ho(this.G)).cleanVal()))};_.Yd=function f6b(a){var b;c6b((b=this,AF(a),b))};var UP=qLe(xmf,'MaterialFloatInputMask',2659);Svb(2657,324,V2e,u6b);_.Xd=function v6b(){return gMe(ILe($wnd.$(ho(this.G)).cleanVal()))};_.Yd=function w6b(a){var b;t6b((b=this,AF(a),b))};var XP=qLe(xmf,'MaterialIntegerInputMask',2657);Svb(2660,324,V2e,y6b);_.Xd=function z6b(){return rMe(JLe($wnd.$(ho(this.G)).cleanVal()))};_.Yd=function A6b(a){var b;x6b((b=this,AF(a),b))};var YP=qLe(xmf,'MaterialLongInputMask',2660);Svb(2709,1,{},G6b);var $P=qLe('gwt.material.design.addins.client.inputmask.base','DateInputParser',2709);Svb(975,56,V0e,GFd);_.Fe=function HFd(){Qze();kKb(this,new Sze(Hgf,'An inputmask helps the user with the input by ensuring a predefined format. This can be useful for dates, numerics, phone numbers etc...','addins/inputmask/InputMask',''))};var T3=qLe(waf,'InputMaskPresenter',975);Svb(1368,65,W0e,NFd);var d4=qLe(waf,'InputMaskView',1368);Svb(1876,1,{},PFd);var c4=qLe(waf,'InputMaskView_BinderImpl/Widgets',1876);Svb(1877,1,w0e,QFd);_.Bd=function RFd(a){fnd(nF(a.a))};var V3=qLe(waf,'InputMaskView_BinderImpl/Widgets/1',1877);Svb(1886,1,E1e,SFd);_.od=function TFd(a){O5b(this.a.n.i,Cmf)};var U3=qLe(waf,'InputMaskView_BinderImpl/Widgets/10',1886);Svb(1878,1,w0e,UFd);_.Bd=function VFd(a){fnd(gMe(ILe($wnd.$(ho(this.a.n.e.G)).cleanVal()))+'')};var W3=qLe(waf,'InputMaskView_BinderImpl/Widgets/2',1878);Svb(1879,1,w0e,WFd);_.Bd=function XFd(a){fnd(''+LLe(HLe($wnd.$(ho(this.a.n.c.G)).cleanVal())))};var X3=qLe(waf,'InputMaskView_BinderImpl/Widgets/3',1879);Svb(1880,1,w0e,YFd);_.Bd=function ZFd(a){fnd(''+(new OLe(SLe($wnd.$(ho(this.a.n.d.G)).cleanVal()))).a)};var Y3=qLe(waf,'InputMaskView_BinderImpl/Widgets/4',1880);Svb(1881,1,w0e,$Fd);_.Bd=function _Fd(a){fnd(''+Jvb(rMe(JLe($wnd.$(ho(this.a.n.f.G)).cleanVal())).a))};var Z3=qLe(waf,'InputMaskView_BinderImpl/Widgets/5',1881);Svb(1882,1,w0e,aGd);_.Bd=function bGd(a){fnd(dE(W5b(this.a.n.b)))};var $3=qLe(waf,'InputMaskView_BinderImpl/Widgets/6',1882);Svb(1883,1,E1e,cGd);_.od=function dGd(a){fnd($wnd.$(ho(this.a.n.a.G)).cleanVal())};var _3=qLe(waf,'InputMaskView_BinderImpl/Widgets/7',1883);Svb(1884,1,E1e,eGd);_.od=function fGd(a){fnd(nF(b5b(this.a.n.g)))};var a4=qLe(waf,'InputMaskView_BinderImpl/Widgets/8',1884);Svb(1885,1,E1e,gGd);_.od=function hGd(a){$wnd.$(ho(this.a.n.i.G)).unmask()};var b4=qLe(waf,'InputMaskView_BinderImpl/Widgets/9',1885);Svb(816,1,a9e);_.Yc=function qGd(){COb(this.b,jGd(this.a.a))};var zMe,AMe,BMe,CMe;var DF=tLe('long','J');eYe(Kq)(10);\n//# sourceURL=gwtmaterialdemo-10.js\n")
