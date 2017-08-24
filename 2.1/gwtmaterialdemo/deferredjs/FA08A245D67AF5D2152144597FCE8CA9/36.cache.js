$wnd.gwtmaterialdemo.runAsyncCallback36("function ScrollspyPresenter(eventBus, view, proxy){\n  $clinit_PresenterWidget();\n  Presenter.call(this, eventBus, view, proxy, ($clinit_ApplicationPresenter() , SLOT_MAIN));\n}\n\ndefineClass(924, 57, $intern_57, ScrollspyPresenter);\n_.onReveal = function onReveal_57(){\n  $clinit_SetPageTitleEvent();\n  $fireEvent_1(this, new SetPageTitleEvent('Scrollspy', \"Scrollspy is a jQuery plugin that tracks certain elements and which element the user's screen is currently centered on. Our main demo of this is our table of contents on every documentation page to the right. Clicking on these links will also scroll the page to that element.\", 'components/scrollspy/Scrollsp', ''));\n}\n;\nvar Lgwt_material_design_demo_client_application_components_scrollspy_ScrollspyPresenter_2_classLit = createForClass('gwt.material.design.demo.client.application.components.scrollspy', 'ScrollspyPresenter', 924);\nfunction ScrollspyView(){\n  ViewImpl.call(this);\n  $initWidget_0(this, $build_f_MaterialPanel1_17(new ScrollspyView_BinderImpl$Widgets(this)));\n  apply_2(this.scrollspy, 400, null, 0);\n}\n\ndefineClass(1302, 60, $intern_58, ScrollspyView);\nvar Lgwt_material_design_demo_client_application_components_scrollspy_ScrollspyView_2_classLit = createForClass('gwt.material.design.demo.client.application.components.scrollspy', 'ScrollspyView', 1302);\nfunction $build_f_MaterialPanel1_17(this$static){\n  var f_MaterialPanel1, f_HTMLPanel2, __attachRecord__, f_MaterialRow3, f_MaterialRow4, f_MaterialColumn5, f_MaterialPanel6, f_MaterialPanel8, f_MaterialPanel10, f_MaterialPanel12, f_MaterialColumn15, scrollspy, f_MaterialTitle7, f_MaterialTitle9, f_MaterialTitle11, f_MaterialTitle13, f_PrettyPre14, sb, f_MaterialLink16, f_MaterialLink17, f_MaterialLink18, f_MaterialLink19;\n  f_MaterialPanel1 = new MaterialPanel;\n  $add_14(f_MaterialPanel1, (f_HTMLPanel2 = new HTMLPanel($html2_3(this$static.domId0).html_0) , __attachRecord__ = attachToDom(($clinit_DOM() , f_HTMLPanel2.element_0)) , $get_0(this$static.domId0Element) , __attachRecord__.origParent?$insertBefore(__attachRecord__.origParent, __attachRecord__.element, __attachRecord__.origSibling):orphan(__attachRecord__.element) , $addAndReplaceElement(f_HTMLPanel2, (f_MaterialRow3 = new MaterialRow , $add_14(f_MaterialRow3, (f_MaterialRow4 = new MaterialRow , $add_14(f_MaterialRow4, (f_MaterialColumn5 = new MaterialColumn , $add_14(f_MaterialColumn5, (f_MaterialPanel6 = new MaterialPanel , $add_14(f_MaterialPanel6, (f_MaterialTitle7 = new MaterialTitle , $setText_13(f_MaterialTitle7.paragraph, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,') , $setInnerHTML($getElement(f_MaterialTitle7.header), ($clinit_SafeHtmlUtils() , (new SafeHtmlString(htmlEscape('Topic 1'))).html_0)) , fire_5(f_MaterialTitle7, 'Topic 1') , f_MaterialTitle7)) , $setScrollspy((!f_MaterialPanel6.scrollspyMixin && (f_MaterialPanel6.scrollspyMixin = new ScrollspyMixin(f_MaterialPanel6)) , f_MaterialPanel6.scrollspyMixin), 'topic1') , f_MaterialPanel6)) , $add_14(f_MaterialColumn5, (f_MaterialPanel8 = new MaterialPanel , $add_14(f_MaterialPanel8, (f_MaterialTitle9 = new MaterialTitle , $setText_13(f_MaterialTitle9.paragraph, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,') , $setInnerHTML($getElement(f_MaterialTitle9.header), (new SafeHtmlString(htmlEscape('Topic 2'))).html_0) , fire_5(f_MaterialTitle9, 'Topic 2') , f_MaterialTitle9)) , $setScrollspy((!f_MaterialPanel8.scrollspyMixin && (f_MaterialPanel8.scrollspyMixin = new ScrollspyMixin(f_MaterialPanel8)) , f_MaterialPanel8.scrollspyMixin), 'topic2') , f_MaterialPanel8)) , $add_14(f_MaterialColumn5, (f_MaterialPanel10 = new MaterialPanel , $add_14(f_MaterialPanel10, (f_MaterialTitle11 = new MaterialTitle , $setText_13(f_MaterialTitle11.paragraph, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,') , $setInnerHTML($getElement(f_MaterialTitle11.header), (new SafeHtmlString(htmlEscape('Topic 3'))).html_0) , fire_5(f_MaterialTitle11, 'Topic 3') , f_MaterialTitle11)) , $setScrollspy((!f_MaterialPanel10.scrollspyMixin && (f_MaterialPanel10.scrollspyMixin = new ScrollspyMixin(f_MaterialPanel10)) , f_MaterialPanel10.scrollspyMixin), 'topic3') , f_MaterialPanel10)) , $add_14(f_MaterialColumn5, (f_MaterialPanel12 = new MaterialPanel , $add_14(f_MaterialPanel12, (f_MaterialTitle13 = new MaterialTitle , $setText_13(f_MaterialTitle13.paragraph, '') , $setInnerHTML($getElement(f_MaterialTitle13.header), (new SafeHtmlString(htmlEscape('Code'))).html_0) , fire_5(f_MaterialTitle13, 'Code') , f_MaterialTitle13)) , $add_14(f_MaterialPanel12, (f_PrettyPre14 = new PrettyPre , $setHTML_0(f_PrettyPre14, (sb = new StringBuilder , sb.string += '\\u2003&lt;m:MaterialRow&gt;<br> \\u2003&lt;m:MaterialColumn grid=\"l10\"&gt;<br> \\u2003\\u2003&lt;m:MaterialPanel scrollspy=\"topic1\"&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialTitle title=\"Topic 1\" description=\"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,\"/&gt;<br> \\u2003\\u2003&lt;/m:MaterialPanel&gt;<br><br>  \\u2003\\u2003&lt;m:MaterialPanel scrollspy=\"topic2\"&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialTitle title=\"Topic 2\" description=\"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,\"/&gt;<br> \\u2003\\u2003&lt;/m:MaterialPanel&gt;<br><br>  \\u2003\\u2003&lt;m:MaterialPanel scrollspy=\"topic3\"&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialTitle title=\"Topic 3\" description=\"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,\"/&gt;<br> \\u2003\\u2003&lt;/m:MaterialPanel&gt;<br><br>  \\u2003\\u2003&lt;m:MaterialPanel scrollspy=\"code\"&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialTitle title=\"Code\" description=\"\"/&gt;<br> \\u2003\\u2003\\u2003&lt;demo:PrettyPre addStyleNames=\"language-xml\"&gt;<br><br>  \\u2003\\u2003\\u2003&lt;/demo:PrettyPre&gt;<br> \\u2003\\u2003&lt;/m:MaterialPanel&gt;<br> \\u2003&lt;/m:MaterialColumn&gt;<br> \\u2003&lt;m:MaterialColumn grid=\"l2\" addStyleNames=\"hide-on-small-only\"&gt;<br> \\u2003\\u2003&lt;m:MaterialScrollspy addStyleNames=\"pinned\" textColor=\"green\"&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialLink href=\"#topic1\" text=\"Topic 1\"/&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialLink href=\"#topic2\" text=\"Topic 2\"/&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialLink href=\"#topic3\" text=\"Topic 3\"/&gt;<br> \\u2003\\u2003\\u2003&lt;m:MaterialLink href=\"#code\" text=\"Code\"/&gt;<br> \\u2003\\u2003&lt;/m:MaterialScrollspy&gt;<br> \\u2003&lt;/m:MaterialColumn&gt;<br> &lt;/m:MaterialRow&gt;<br>' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string)).html_0) , setStyleName(f_PrettyPre14.element_0, 'language-xml', true) , f_PrettyPre14)) , $setScrollspy((!f_MaterialPanel12.scrollspyMixin && (f_MaterialPanel12.scrollspyMixin = new ScrollspyMixin(f_MaterialPanel12)) , f_MaterialPanel12.scrollspyMixin), 'code') , f_MaterialPanel12)) , $setGrid_0((!f_MaterialColumn5.gridMixin && (f_MaterialColumn5.gridMixin = new GridMixin(f_MaterialColumn5)) , f_MaterialColumn5.gridMixin), 'l10') , f_MaterialColumn5)) , $add_14(f_MaterialRow4, (f_MaterialColumn15 = new MaterialColumn , $add_14(f_MaterialColumn15, (scrollspy = new MaterialScrollspy , $add_19(scrollspy, (f_MaterialLink16 = new MaterialLink , $setText_9(f_MaterialLink16.span_1, 'Topic 1') , f_MaterialLink16.span_1.attached || $add_14(f_MaterialLink16, f_MaterialLink16.span_1) , f_MaterialLink16.element_0.setAttribute('href', '#topic1') , f_MaterialLink16)) , $add_19(scrollspy, (f_MaterialLink17 = new MaterialLink , $setText_9(f_MaterialLink17.span_1, 'Topic 2') , f_MaterialLink17.span_1.attached || $add_14(f_MaterialLink17, f_MaterialLink17.span_1) , f_MaterialLink17.element_0.setAttribute('href', '#topic2') , f_MaterialLink17)) , $add_19(scrollspy, (f_MaterialLink18 = new MaterialLink , $setText_9(f_MaterialLink18.span_1, 'Topic 3') , f_MaterialLink18.span_1.attached || $add_14(f_MaterialLink18, f_MaterialLink18.span_1) , f_MaterialLink18.element_0.setAttribute('href', '#topic3') , f_MaterialLink18)) , $add_19(scrollspy, (f_MaterialLink19 = new MaterialLink , $setText_9(f_MaterialLink19.span_1, 'Code') , f_MaterialLink19.span_1.attached || $add_14(f_MaterialLink19, f_MaterialLink19.span_1) , f_MaterialLink19.element_0.setAttribute('href', '#code') , f_MaterialLink19)) , $setTextColor(scrollspy, ($clinit_Color() , GREEN)) , this$static.owner.scrollspy = scrollspy , scrollspy)) , setStyleName(f_MaterialColumn15.element_0, 'test', true) , $setGrid_0((!f_MaterialColumn15.gridMixin && (f_MaterialColumn15.gridMixin = new GridMixin(f_MaterialColumn15)) , f_MaterialColumn15.gridMixin), 'l2') , f_MaterialColumn15)) , f_MaterialRow4)) , setStyleName(f_MaterialRow3.element_0, 'code', true) , f_MaterialRow3), $get_0(this$static.domId0Element)) , f_HTMLPanel2));\n  return f_MaterialPanel1;\n}\n\nfunction ScrollspyView_BinderImpl$Widgets(owner){\n  this.owner = owner;\n  this.domId0 = $createUniqueId($doc);\n  this.domId0Element = new LazyDomElement(this.domId0);\n}\n\ndefineClass(1747, 1, {}, ScrollspyView_BinderImpl$Widgets);\nvar Lgwt_material_design_demo_client_application_components_scrollspy_ScrollspyView_1BinderImpl$Widgets_2_classLit = createForClass('gwt.material.design.demo.client.application.components.scrollspy', 'ScrollspyView_BinderImpl/Widgets', 1747);\nfunction $html2_3(arg0){\n  var sb;\n  sb = new StringBuilder;\n  sb.string += \"<span id='\";\n  $append_4(sb, htmlEscape(arg0));\n  sb.string += \"'><\\/span>\";\n  return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string);\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyPresenter$_annotation$$none$$(this$static){\n  var result, result0;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyPresenter$_annotation$$none$$) {\n    result0 = new ScrollspyPresenter($get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$($getFragment_com_google_web_bindery_event_shared(this$static.injector)), (result = $get_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyView$_annotation$$none$$(this$static) , result), $get_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyPresenter$MyProxy$_annotation$$none$$(this$static));\n    $automaticBind(($getFragment_com_gwtplatform_mvp_client(this$static.injector) , result0), $get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$($getFragment_com_gwtplatform_mvp_client(this$static.injector)));\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyPresenter$_annotation$$none$$ = result0;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyPresenter$_annotation$$none$$;\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyView$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyView$_annotation$$none$$) {\n    result = new ScrollspyView;\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyView$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyView$_annotation$$none$$;\n}\n\ndefineClass(827, 1, $intern_116);\n_.onSuccess_0 = function onSuccess_37(){\n  $onSuccess(this.val$callback2, $get_Key$type$gwt$material$design$demo$client$application$components$scrollspy$ScrollspyPresenter$_annotation$$none$$(this.this$11.this$01));\n}\n;\n$entry(onLoad_0)(36);\n\n//# sourceURL=gwtmaterialdemo-36.js\n")
