$wnd.gwtmaterialdemo.runAsyncCallback19("function $clinit_DateTimeFormat_0(){\n  $clinit_DateTimeFormat_0 = emptyMethod;\n  $clinit_DateTimeFormat();\n  cache_1 = new HashMap;\n}\n\nfunction DateTimeFormat_0(){\n  DateTimeFormat.call(this, 'hh:mm a');\n}\n\nfunction getFormat_0(dtfi){\n  $clinit_DateTimeFormat_0();\n  var defaultDtfi, dtf;\n  defaultDtfi = $getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance_2));\n  dtf = null;\n  dtfi == defaultDtfi && (dtf = castTo($getStringValue(cache_1, 'hh:mm a'), 437));\n  if (!dtf) {\n    dtf = new DateTimeFormat_0;\n    dtfi == defaultDtfi && $putStringValue(cache_1, 'hh:mm a', dtf);\n  }\n  return dtf;\n}\n\ndefineClass(437, 330, {437:1, 330:1}, DateTimeFormat_0);\nvar cache_1;\nvar Lcom_google_gwt_i18n_client_DateTimeFormat_2_classLit = createForClass('com.google.gwt.i18n.client', 'DateTimeFormat', 437);\nfunction $detectAndApplyOrientation_0(this$static){\n  matchMedia_0('(orientation: portrait)')?$setOrientation(this$static, ($clinit_Orientation() , PORTRAIT_0)):$setOrientation(this$static, ($clinit_Orientation() , LANDSCAPE_0));\n}\n\nfunction $open_2(this$static){\n  $scheduleDeferred(($clinit_SchedulerImpl() , INSTANCE), new MaterialTimePicker$lambda$1$Type(this$static));\n}\n\nfunction $setDetectOrientation_0(this$static){\n  if (this$static.orientationHandler) {\n    $removeHandler(this$static.orientationHandler.real);\n    this$static.orientationHandler = null;\n  }\n  this$static.orientationHandler = addResizeHandler(new MaterialTimePicker$lambda$0$Type(this$static));\n  matchMedia_0('(orientation: portrait)')?$setOrientation(this$static, ($clinit_Orientation() , PORTRAIT_0)):$setOrientation(this$static, ($clinit_Orientation() , LANDSCAPE_0));\n}\n\nfunction $setOrientation(this$static, orientation){\n  this$static.orientation = orientation;\n  this$static.initialize?$wnd.$($getElement(this$static.timeInput)).lolliclock('setOrientation', orientation.cssClass):$initialize_3(this$static);\n}\n\nfunction MaterialTimePicker$lambda$0$Type($$outer_0){\n  this.$$outer_0 = $$outer_0;\n}\n\ndefineClass(1941, 1, $intern_45, MaterialTimePicker$lambda$0$Type);\n_.onResize = function onResize_13(arg0){\n  $detectAndApplyOrientation_0(this.$$outer_0);\n}\n;\nvar Lgwt_material_design_addins_client_timepicker_MaterialTimePicker$lambda$0$Type_2_classLit = createForClass('gwt.material.design.addins.client.timepicker', 'MaterialTimePicker/lambda$0$Type', 1941);\nfunction MaterialTimePicker$lambda$1$Type($$outer_0){\n  this.$$outer_0 = $$outer_0;\n}\n\ndefineClass(1944, 1, {}, MaterialTimePicker$lambda$1$Type);\n_.execute_1 = function execute_36(){\n  $wnd.$($getElement(this.$$outer_0.timeInput)).lolliclock('show');\n}\n;\nvar Lgwt_material_design_addins_client_timepicker_MaterialTimePicker$lambda$1$Type_2_classLit = createForClass('gwt.material.design.addins.client.timepicker', 'MaterialTimePicker/lambda$1$Type', 1944);\nfunction TimePickersPresenter(eventBus, view, proxy){\n  $clinit_TimePickersPresenter();\n  Presenter.call(this, eventBus, view, proxy, ($clinit_ApplicationPresenter() , SLOT_MAIN));\n}\n\ndefineClass(897, 57, $intern_56, TimePickersPresenter);\n_.onReveal = function onReveal_30(){\n  $clinit_SetPageTitleEvent();\n  $fireEvent_1(this, new SetPageTitleEvent('Time Pickers', 'A dialog picker is used to select a single time (hours:minutes) on mobile.\\n\\nThe selected time is indicated by the filled circle at the end of the clock hand.', 'addins/timepickers/TimePickersView', 'https://material.io/guidelines/components/pickers.html#pickers-time-pickers'));\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersPresenter_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersPresenter', 897);\nfunction TimePickersView(){\n  ViewImpl.call(this);\n  $initWidget_0(this, $build_f_MaterialPanel1_10(new TimePickersView_BinderImpl$Widgets(this)));\n  $addHandler_0(this.tpEvents, new TimePickersView$lambda$0$Type, (!TYPE_17 && (TYPE_17 = new GwtEvent$Type) , TYPE_17));\n  $addHandler_0(this.tpEvents, new TimePickersView$lambda$1$Type, TYPE_16?TYPE_16:(TYPE_16 = new GwtEvent$Type));\n  $addHandler_0(this.tpEvents, new TimePickersView$lambda$2$Type, (!TYPE_20 && (TYPE_20 = new GwtEvent$Type) , TYPE_20));\n  $addHandler_0(this.tpOpenClose, new TimePickersView$lambda$3$Type, (!TYPE_17 && (TYPE_17 = new GwtEvent$Type) , TYPE_17));\n  $addHandler_0(this.tpOpenClose, new TimePickersView$lambda$4$Type, TYPE_16?TYPE_16:(TYPE_16 = new GwtEvent$Type));\n  $addHandler_0(this.tpOpenClose, new TimePickersView$lambda$5$Type, (!TYPE_20 && (TYPE_20 = new GwtEvent$Type) , TYPE_20));\n}\n\ndefineClass(1221, 60, $intern_57, TimePickersView);\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView', 1221);\nfunction TimePickersView$lambda$0$Type(){\n}\n\ndefineClass(1222, 1, $intern_105, TimePickersView$lambda$0$Type);\n_.onOpen = function onOpen_5(arg0){\n  $toast(new MaterialToast_0(stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, 1), $intern_3, 20, 0, [])), 'Opened Time Picker', $intern_69, null);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView$lambda$0$Type_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView/lambda$0$Type', 1222);\nfunction TimePickersView$lambda$1$Type(){\n}\n\ndefineClass(1223, 1, $intern_50, TimePickersView$lambda$1$Type);\n_.onClose_0 = function onClose_5(arg0){\n  $toast(new MaterialToast_0(stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, 1), $intern_3, 20, 0, [])), 'Closed Time Picker', $intern_69, null);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView$lambda$1$Type_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView/lambda$1$Type', 1223);\nfunction TimePickersView$lambda$2$Type(){\n}\n\ndefineClass(1224, 1, $intern_47, TimePickersView$lambda$2$Type);\n_.onValueChange = function onValueChange_25(arg0){\n  var dtf, time;\n  dtf = ($clinit_DateTimeFormat_0() , getFormat_0($getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance_2))));\n  time = castTo(arg0.value_0, 100);\n  fireToast('MaterialTimePicker value changed to: ' + $format(dtf, time, null));\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView$lambda$2$Type_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView/lambda$2$Type', 1224);\nfunction TimePickersView$lambda$3$Type(){\n}\n\ndefineClass(1225, 1, $intern_105, TimePickersView$lambda$3$Type);\n_.onOpen = function onOpen_6(arg0){\n  $toast(new MaterialToast_0(stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, 1), $intern_3, 20, 0, [])), 'Opened Time Picker', $intern_69, null);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView$lambda$3$Type_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView/lambda$3$Type', 1225);\nfunction TimePickersView$lambda$4$Type(){\n}\n\ndefineClass(1226, 1, $intern_50, TimePickersView$lambda$4$Type);\n_.onClose_0 = function onClose_6(arg0){\n  $toast(new MaterialToast_0(stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, 1), $intern_3, 20, 0, [])), 'Closed Time Picker', $intern_69, null);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView$lambda$4$Type_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView/lambda$4$Type', 1226);\nfunction TimePickersView$lambda$5$Type(){\n}\n\ndefineClass(1227, 1, $intern_47, TimePickersView$lambda$5$Type);\n_.onValueChange = function onValueChange_26(arg0){\n  var dtf, time;\n  dtf = ($clinit_DateTimeFormat_0() , getFormat_0($getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance_2))));\n  time = castTo(arg0.value_0, 100);\n  fireToast('MaterialTimePicker value changed to: ' + $format(dtf, time, null));\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView$lambda$5$Type_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView/lambda$5$Type', 1227);\nfunction $build_f_MaterialPanel1_10(this$static){\n  var f_MaterialPanel1, f_MaterialRow2, f_MaterialRow7, f_MaterialRow10, f_MaterialRow14, f_MaterialRow17, f_MaterialRow20, f_MaterialRow24, f_MaterialRow27, f_MaterialRow31, f_MaterialTitle3, f_PrettyPre4, sb, f_MaterialTitle5, tp, f_PrettyPre6, sb_0, f_MaterialTitle8, f_timepicker$MaterialTimePicker9, f_MaterialTitle11, f_timepicker$MaterialTimePicker12, f_PrettyPre13, sb_1, f_MaterialTitle15, tpOpenClose, btnOpen, f_PrettyPre16, sb_2, f_MaterialTitle18, tpAutoClose, f_PrettyPre19, sb_3, f_MaterialTitle21, f_timepicker$MaterialTimePicker22, f_PrettyPre23, sb_4, f_MaterialTitle25, tpEvents, f_PrettyPre26, sb_5, f_MaterialBadge28, f_MaterialTitle29, tpValue, btnTpValue, btnTpValueEvent, f_PrettyPre30, sb_6, f_MaterialTitle32, tpClear, btnClear, f_PrettyPre33, sb_7;\n  f_MaterialPanel1 = new MaterialPanel;\n  $add_14(f_MaterialPanel1, (f_MaterialRow2 = new MaterialRow , $add_14(f_MaterialRow2, (f_MaterialTitle3 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle3.header), ($clinit_SafeHtmlUtils() , (new SafeHtmlString(htmlEscape('Usage'))).html_0)) , fire_5(f_MaterialTitle3, 'Usage') , f_MaterialTitle3)) , $add_14(f_MaterialRow2, (f_PrettyPre4 = new PrettyPre , $setHTML_0(f_PrettyPre4, (sb = new StringBuilder , sb.string += '\\u2003&lt;!-- Addin Import --&gt;<br> xmlns:ma=\"urn:import:gwt.material.design.addins.client\"<br><br> &lt;!-- Addin Usage --&gt;<br> &lt;ma:timepicker.MaterialTimePicker ui:field=\"tp\" placeholder=\"Snooze Time\" /&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string)).html_0) , setStyleName(($clinit_DOM() , f_PrettyPre4.element_0), 'lang-xml', true) , f_PrettyPre4)) , $add_14(f_MaterialRow2, (f_MaterialTitle5 = new MaterialTitle , $setText_13(f_MaterialTitle5.paragraph, 'Tap between the hour and minute label in the title bar to switch between the hour or minute view. Additionally, tap on the AM/PM label in the title bar to switch between AM or PM (in 12-hour clock mode).') , $setInnerHTML($getElement(f_MaterialTitle5.header), (new SafeHtmlString(htmlEscape('Time Picker'))).html_0) , fire_5(f_MaterialTitle5, 'Time Picker') , f_MaterialTitle5)) , $add_14(f_MaterialRow2, (tp = new MaterialTimePicker , $setGrid_0((!tp.gridMixin && (tp.gridMixin = new GridMixin(tp)) , tp.gridMixin), 's12') , $setText_12(tp.placeholderLabel, 'Snooze Time') , tp)) , $add_14(f_MaterialRow2, (f_PrettyPre6 = new PrettyPre , $setHTML_0(f_PrettyPre6, (sb_0 = new StringBuilder , sb_0.string += '&lt;ma:timepicker.MaterialTimePicker ui:field=\"tp\" placeholder=\"Snooze Time\" /&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_0.string)).html_0) , setStyleName(f_PrettyPre6.element_0, 'lang-xml', true) , f_PrettyPre6)) , setStyleName(f_MaterialRow2.element_0, 'code', true) , f_MaterialRow2));\n  $add_14(f_MaterialPanel1, (f_MaterialRow7 = new MaterialRow , $add_14(f_MaterialRow7, (f_MaterialTitle8 = new MaterialTitle , $setText_13(f_MaterialTitle8.paragraph, \"You can disable your time picker by adding enabled='false'\") , $setInnerHTML($getElement(f_MaterialTitle8.header), (new SafeHtmlString(htmlEscape('Disabled Styles'))).html_0) , fire_5(f_MaterialTitle8, 'Disabled Styles') , f_MaterialTitle8)) , $add_14(f_MaterialRow7, (f_timepicker$MaterialTimePicker9 = new MaterialTimePicker , $setGrid_0((!f_timepicker$MaterialTimePicker9.gridMixin && (f_timepicker$MaterialTimePicker9.gridMixin = new GridMixin(f_timepicker$MaterialTimePicker9)) , f_timepicker$MaterialTimePicker9.gridMixin), 's12') , $setText_12(f_timepicker$MaterialTimePicker9.placeholderLabel, 'Snooze Time') , $setEnabled_0(f_timepicker$MaterialTimePicker9.timeInput, false) , f_timepicker$MaterialTimePicker9)) , setStyleName(f_MaterialRow7.element_0, 'code', true) , f_MaterialRow7));\n  $add_14(f_MaterialPanel1, (f_MaterialRow10 = new MaterialRow , $add_14(f_MaterialRow10, (f_MaterialTitle11 = new MaterialTitle , $setText_13(f_MaterialTitle11.paragraph, \"You can set 24 hour format of time picker by adding a parameter : hour24='true'\") , $setInnerHTML($getElement(f_MaterialTitle11.header), (new SafeHtmlString(htmlEscape('24 Hour format'))).html_0) , fire_5(f_MaterialTitle11, '24 Hour format') , f_MaterialTitle11)) , $add_14(f_MaterialRow10, (f_timepicker$MaterialTimePicker12 = new MaterialTimePicker , $setGrid_0((!f_timepicker$MaterialTimePicker12.gridMixin && (f_timepicker$MaterialTimePicker12.gridMixin = new GridMixin(f_timepicker$MaterialTimePicker12)) , f_timepicker$MaterialTimePicker12.gridMixin), 's12') , $setText_12(f_timepicker$MaterialTimePicker12.placeholderLabel, 'Snooze Time') , f_timepicker$MaterialTimePicker12.hour24 = true , f_timepicker$MaterialTimePicker12)) , $add_14(f_MaterialRow10, (f_PrettyPre13 = new PrettyPre , $setHTML_0(f_PrettyPre13, (sb_1 = new StringBuilder , sb_1.string += '&lt;ma:timepicker.MaterialTimePicker ui:field=\"tp\" placeholder=\"Snooze Time\" hour24=\"true\"/&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_1.string)).html_0) , setStyleName(f_PrettyPre13.element_0, 'lang-xml', true) , f_PrettyPre13)) , setStyleName(f_MaterialRow10.element_0, 'code', true) , f_MaterialRow10));\n  $add_14(f_MaterialPanel1, (f_MaterialRow14 = new MaterialRow , $add_14(f_MaterialRow14, (f_MaterialTitle15 = new MaterialTitle , $setText_13(f_MaterialTitle15.paragraph, 'You can programmatically control the time picker component.') , $setInnerHTML($getElement(f_MaterialTitle15.header), (new SafeHtmlString(htmlEscape('Open / Close Control'))).html_0) , fire_5(f_MaterialTitle15, 'Open / Close Control') , f_MaterialTitle15)) , $add_14(f_MaterialRow14, (tpOpenClose = new MaterialTimePicker , $setGrid_0((!tpOpenClose.gridMixin && (tpOpenClose.gridMixin = new GridMixin(tpOpenClose)) , tpOpenClose.gridMixin), 's12') , $setText_12(tpOpenClose.placeholderLabel, 'Snooze Time') , this$static.owner.tpOpenClose = tpOpenClose , tpOpenClose)) , $add_14(f_MaterialRow14, (btnOpen = new MaterialButton , $setText_9(btnOpen.span_1, 'Open Time Picker') , btnOpen.span_1.attached || $add_14(btnOpen, btnOpen.span_1) , $addClickHandler(btnOpen, this$static.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5) , btnOpen)) , $add_14(f_MaterialRow14, (f_PrettyPre16 = new PrettyPre , $setHTML_0(f_PrettyPre16, (sb_2 = new StringBuilder , sb_2.string += '\\u2003tp.open() <br> tp.close()' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_2.string)).html_0) , setStyleName(f_PrettyPre16.element_0, 'lang-java', true) , f_PrettyPre16)) , setStyleName(f_MaterialRow14.element_0, 'code', true) , f_MaterialRow14));\n  $add_14(f_MaterialPanel1, (f_MaterialRow17 = new MaterialRow , $add_14(f_MaterialRow17, (f_MaterialTitle18 = new MaterialTitle , $setText_13(f_MaterialTitle18.paragraph, 'Provides a way to automatically closes the timepicker after selecting time.') , $setInnerHTML($getElement(f_MaterialTitle18.header), (new SafeHtmlString(htmlEscape('Auto Close'))).html_0) , fire_5(f_MaterialTitle18, 'Auto Close') , f_MaterialTitle18)) , $add_14(f_MaterialRow17, (tpAutoClose = new MaterialTimePicker , $setGrid_0((!tpAutoClose.gridMixin && (tpAutoClose.gridMixin = new GridMixin(tpAutoClose)) , tpAutoClose.gridMixin), 's12') , $setText_12(tpAutoClose.placeholderLabel, 'Time') , tpAutoClose.autoClose = true , tpAutoClose)) , $add_14(f_MaterialRow17, (f_PrettyPre19 = new PrettyPre , $setHTML_0(f_PrettyPre19, (sb_3 = new StringBuilder , sb_3.string += '&lt;ma:timepicker.MaterialTimePicker autoClose=\"true\" placeholder=\"Time\" /&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_3.string)).html_0) , setStyleName(f_PrettyPre19.element_0, 'lang-xml', true) , f_PrettyPre19)) , setStyleName(f_MaterialRow17.element_0, 'code', true) , f_MaterialRow17));\n  $add_14(f_MaterialPanel1, (f_MaterialRow20 = new MaterialRow , $add_14(f_MaterialRow20, (f_MaterialTitle21 = new MaterialTitle , $setText_13(f_MaterialTitle21.paragraph, 'Open this time picker on a mobile device to test.') , $setInnerHTML($getElement(f_MaterialTitle21.header), (new SafeHtmlString(htmlEscape('Mobile'))).html_0) , fire_5(f_MaterialTitle21, 'Mobile') , f_MaterialTitle21)) , $add_14(f_MaterialRow20, (f_timepicker$MaterialTimePicker22 = new MaterialTimePicker , $setGrid_0((!f_timepicker$MaterialTimePicker22.gridMixin && (f_timepicker$MaterialTimePicker22.gridMixin = new GridMixin(f_timepicker$MaterialTimePicker22)) , f_timepicker$MaterialTimePicker22.gridMixin), 's12') , $setDetectOrientation_0(f_timepicker$MaterialTimePicker22) , $setText_12(f_timepicker$MaterialTimePicker22.placeholderLabel, 'Time') , f_timepicker$MaterialTimePicker22)) , $add_14(f_MaterialRow20, (f_PrettyPre23 = new PrettyPre , $setHTML_0(f_PrettyPre23, (sb_4 = new StringBuilder , sb_4.string += '&lt;ma:timepicker.MaterialTimePicker detectOrientation=\"true\" placeholder=\"Time\" /&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_4.string)).html_0) , setStyleName(f_PrettyPre23.element_0, 'lang-xml', true) , f_PrettyPre23)) , setStyleName(f_MaterialRow20.element_0, 'code', true) , f_MaterialRow20));\n  $add_14(f_MaterialPanel1, (f_MaterialRow24 = new MaterialRow , $add_14(f_MaterialRow24, (f_MaterialTitle25 = new MaterialTitle , $setText_13(f_MaterialTitle25.paragraph, 'We provided events on time picker namely : Close, Open, ValueChange events.') , $setInnerHTML($getElement(f_MaterialTitle25.header), (new SafeHtmlString(htmlEscape('Events'))).html_0) , fire_5(f_MaterialTitle25, 'Events') , f_MaterialTitle25)) , $add_14(f_MaterialRow24, (tpEvents = new MaterialTimePicker , $setGrid_0((!tpEvents.gridMixin && (tpEvents.gridMixin = new GridMixin(tpEvents)) , tpEvents.gridMixin), 's12') , $setText_12(tpEvents.placeholderLabel, 'Alarm Time') , this$static.owner.tpEvents = tpEvents , tpEvents)) , $add_14(f_MaterialRow24, (f_PrettyPre26 = new PrettyPre , $setHTML_0(f_PrettyPre26, (sb_5 = new StringBuilder , sb_5.string += '\\u2003// Open Handler<br> tpEvents.addOpenHandler(new OpenHandler&lt;String&gt;() {<br> \\u2003@Override<br> \\u2003public void onOpen(OpenEvent&lt;String&gt; event) {<br> \\u2003\\u2003MaterialToast.fireToast(\"Opened Time Picker\");<br> \\u2003}<br> });<br><br> // Close Handler<br> tpEvents.addCloseHandler(new CloseHandler&lt;String&gt;() {<br> \\u2003@Override<br> \\u2003public void onClose(CloseEvent&lt;String&gt; event) {<br> \\u2003\\u2003MaterialToast.fireToast(\"Closed Time Picker\");<br> \\u2003}<br> });<br><br> // ValueChange Handler<br> tpEvents.addValueChangeHandler(new ValueChangeHandler&lt;Date&gt;() {<br> \\u2003@Override<br> \\u2003public void onValueChange(ValueChangeEvent&lt;Date&gt; event) {<br> \\u2003\\u2003DateTimeFormat dtf = DateTimeFormat.getFormat(\"hh:mm a\");<br> \\u2003\\u2003Date time = event.getValue();<br> \\u2003\\u2003MaterialToast.fireToast(\"MaterialTimePicker value changed to: \" + dtf.format(time));<br> \\u2003}<br> });<br>' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_5.string)).html_0) , setStyleName(f_PrettyPre26.element_0, 'lang-java', true) , f_PrettyPre26)) , setStyleName(f_MaterialRow24.element_0, 'code', true) , f_MaterialRow24));\n  $add_14(f_MaterialPanel1, (f_MaterialRow27 = new MaterialRow , $add_14(f_MaterialRow27, (f_MaterialBadge28 = new MaterialBadge , $setBackgroundColor(f_MaterialBadge28, ($clinit_Color() , AMBER_LIGHTEN_5)) , $setShadow_0((!f_MaterialBadge28.shadowMixin && (f_MaterialBadge28.shadowMixin = new ShadowMixin(f_MaterialBadge28)) , f_MaterialBadge28.shadowMixin), 1) , $setLayoutPosition(f_MaterialBadge28, ($clinit_Style$Position() , RELATIVE)) , $setInnerHTML(f_MaterialBadge28.element_0, (new SafeHtmlString(htmlEscape('FEATURE UPDATE'))).html_0) , $setFloat(f_MaterialBadge28, ($clinit_Style$Float() , RIGHT)) , $setTextColor(f_MaterialBadge28, AMBER) , f_MaterialBadge28)) , $add_14(f_MaterialRow27, (f_MaterialTitle29 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle29.header), (new SafeHtmlString(htmlEscape('TimePicker : setValue(value, fireEvents)'))).html_0) , fire_5(f_MaterialTitle29, 'TimePicker : setValue(value, fireEvents)') , f_MaterialTitle29)) , $add_14(f_MaterialRow27, (tpValue = new MaterialTimePicker , $setGrid_0((!tpValue.gridMixin && (tpValue.gridMixin = new GridMixin(tpValue)) , tpValue.gridMixin), 's12') , $setText_12(tpValue.placeholderLabel, 'Time') , $addHandler_0(tpValue, this$static.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1, (!TYPE_20 && (TYPE_20 = new GwtEvent$Type) , TYPE_20)) , this$static.owner.tpValue = tpValue , tpValue)) , $add_14(f_MaterialRow27, (btnTpValue = new MaterialButton , btnTpValue.element_0.style['marginRight'] = ($clinit_Style$Unit() , '20.0px') , $setText_9(btnTpValue.span_1, 'Set Value') , btnTpValue.span_1.attached || $add_14(btnTpValue, btnTpValue.span_1) , $addClickHandler(btnTpValue, this$static.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2) , btnTpValue)) , $add_14(f_MaterialRow27, (btnTpValueEvent = new MaterialButton , $setText_9(btnTpValueEvent.span_1, 'Set Value with Event') , btnTpValueEvent.span_1.attached || $add_14(btnTpValueEvent, btnTpValueEvent.span_1) , $addClickHandler(btnTpValueEvent, this$static.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3) , btnTpValueEvent)) , $add_14(f_MaterialRow27, (f_PrettyPre30 = new PrettyPre , $setHTML_0(f_PrettyPre30, (sb_6 = new StringBuilder , sb_6.string += '// Will not fire an event <br> tpValue.setValue(new Date());<br> tpValue.setValue(new Date(), false);<br><br> // Will fire an event<br> tpValue.setValue(new Date(), true);' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_6.string)).html_0) , setStyleName(f_PrettyPre30.element_0, 'lang-java', true) , f_PrettyPre30)) , setStyleName(f_MaterialRow27.element_0, 'code', true) , f_MaterialRow27));\n  $add_14(f_MaterialPanel1, (f_MaterialRow31 = new MaterialRow , $add_14(f_MaterialRow31, (f_MaterialTitle32 = new MaterialTitle , $setText_13(f_MaterialTitle32.paragraph, 'Clear your time picker value') , $setInnerHTML($getElement(f_MaterialTitle32.header), (new SafeHtmlString(htmlEscape('Clear()'))).html_0) , fire_5(f_MaterialTitle32, 'Clear()') , f_MaterialTitle32)) , $add_14(f_MaterialRow31, (tpClear = new MaterialTimePicker , $setGrid_0((!tpClear.gridMixin && (tpClear.gridMixin = new GridMixin(tpClear)) , tpClear.gridMixin), 's12') , $setText_12(tpClear.placeholderLabel, 'Snooze Time') , this$static.owner.tpClear = tpClear , tpClear)) , $add_14(f_MaterialRow31, (btnClear = new MaterialButton , $setIconType_1(btnClear, ($clinit_IconType() , REFRESH)) , $setText_9(btnClear.span_1, 'Clear') , btnClear.span_1.attached || $add_14(btnClear, btnClear.span_1) , $addClickHandler(btnClear, this$static.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4) , btnClear)) , $add_14(f_MaterialRow31, (f_PrettyPre33 = new PrettyPre , $setHTML_0(f_PrettyPre33, (sb_7 = new StringBuilder , sb_7.string += 'timepick.clear();' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_7.string)).html_0) , setStyleName(f_PrettyPre33.element_0, 'lang-java', true) , f_PrettyPre33)) , setStyleName(f_MaterialRow31.element_0, 'code', true) , f_MaterialRow31));\n  return f_MaterialPanel1;\n}\n\nfunction TimePickersView_BinderImpl$Widgets(owner){\n  this.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new TimePickersView_BinderImpl$Widgets$1;\n  this.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new TimePickersView_BinderImpl$Widgets$2(this);\n  this.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new TimePickersView_BinderImpl$Widgets$3(this);\n  this.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new TimePickersView_BinderImpl$Widgets$4(this);\n  this.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new TimePickersView_BinderImpl$Widgets$5(this);\n  this.owner = owner;\n}\n\ndefineClass(1591, 1, {}, TimePickersView_BinderImpl$Widgets);\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView_1BinderImpl$Widgets_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView_BinderImpl/Widgets', 1591);\nfunction TimePickersView_BinderImpl$Widgets$1(){\n}\n\ndefineClass(1592, 1, $intern_47, TimePickersView_BinderImpl$Widgets$1);\n_.onValueChange = function onValueChange_27(event_0){\n  var dtf, time;\n  dtf = ($clinit_DateTimeFormat_0() , getFormat_0($getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance_2))));\n  time = castTo(event_0.value_0, 100);\n  fireToast('Value : ' + $format(dtf, time, null));\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView_1BinderImpl$Widgets$1_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView_BinderImpl/Widgets/1', 1592);\nfunction TimePickersView_BinderImpl$Widgets$2(this$1){\n  this.this$11 = this$1;\n}\n\ndefineClass(1593, 1, $intern_66, TimePickersView_BinderImpl$Widgets$2);\n_.onClick_0 = function onClick_131(event_0){\n  $setValue_13(this.this$11.owner.tpValue, new Date_0, false);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView_1BinderImpl$Widgets$2_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView_BinderImpl/Widgets/2', 1593);\nfunction TimePickersView_BinderImpl$Widgets$3(this$1){\n  this.this$11 = this$1;\n}\n\ndefineClass(1594, 1, $intern_66, TimePickersView_BinderImpl$Widgets$3);\n_.onClick_0 = function onClick_132(event_0){\n  $setValue_14(this.this$11.owner.tpValue, new Date_0, true);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView_1BinderImpl$Widgets$3_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView_BinderImpl/Widgets/3', 1594);\nfunction TimePickersView_BinderImpl$Widgets$4(this$1){\n  this.this$11 = this$1;\n}\n\ndefineClass(1595, 1, $intern_66, TimePickersView_BinderImpl$Widgets$4);\n_.onClick_0 = function onClick_133(event_0){\n  $clear_7(this.this$11.owner.tpClear);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView_1BinderImpl$Widgets$4_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView_BinderImpl/Widgets/4', 1595);\nfunction TimePickersView_BinderImpl$Widgets$5(this$1){\n  this.this$11 = this$1;\n}\n\ndefineClass(1596, 1, $intern_66, TimePickersView_BinderImpl$Widgets$5);\n_.onClick_0 = function onClick_134(event_0){\n  $open_2(this.this$11.owner.tpOpenClose);\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_timepickers_TimePickersView_1BinderImpl$Widgets$5_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.timepickers', 'TimePickersView_BinderImpl/Widgets/5', 1596);\nfunction $get_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersPresenter$_annotation$$none$$(this$static){\n  var result, result0;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersPresenter$_annotation$$none$$) {\n    result0 = new TimePickersPresenter($get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$($getFragment_com_google_web_bindery_event_shared(this$static.injector)), (result = $get_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersView$_annotation$$none$$(this$static) , result), $get_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersPresenter$MyProxy$_annotation$$none$$(this$static));\n    $automaticBind(($getFragment_com_gwtplatform_mvp_client(this$static.injector) , result0), $get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$($getFragment_com_gwtplatform_mvp_client(this$static.injector)));\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersPresenter$_annotation$$none$$ = result0;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersPresenter$_annotation$$none$$;\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersView$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersView$_annotation$$none$$) {\n    result = new TimePickersView;\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersView$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersView$_annotation$$none$$;\n}\n\ndefineClass(783, 1, $intern_115);\n_.onSuccess_0 = function onSuccess_20(){\n  $onSuccess(this.val$callback2, $get_Key$type$gwt$material$design$demo$client$application$addins$timepickers$TimePickersPresenter$_annotation$$none$$(this.this$11.this$01));\n}\n;\n$entry(onLoad_0)(19);\n\n//# sourceURL=gwtmaterialdemo-19.js\n")
