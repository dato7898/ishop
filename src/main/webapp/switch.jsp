<%@ page pageEncoding="UTF-8" trimDirectiveWhitespaces="false" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="core" uri="/WEB-INF/core.tld"%>

<h5>case null</h5>
<core:switch value="${null}">
	<core:case value="s1">s1</core:case>
	<core:case value="s2">s2</core:case>
	<core:case value="${null}">null</core:case>
	<core:default>default</core:default>
</core:switch>

<h5>case</h5>
<core:switch value="s1">
	<core:case value="s1">s1</core:case>
	<core:case value="s2">s2</core:case>
	<core:case value="s3">s3</core:case>
	<core:default>default</core:default>
</core:switch>

<h5>case with duplicate</h5>
<core:switch value="s2">
	<core:case value="s1">s1</core:case>
	<core:case value="s2">s2</core:case>
	<core:case value="s2">s2</core:case>
	<core:default>default</core:default>
</core:switch>

<h5>default</h5>
<core:switch value="s4">
	<core:case value="s1">s1</core:case>
	<core:case value="s2">s2</core:case>
	<core:case value="s3">s3</core:case>
	<core:default>default</core:default>
</core:switch>

<h5>nothing</h5>
<core:switch value="s4">
	<core:case value="s1">s1</core:case>
	<core:case value="s2">s2</core:case>
	<core:case value="s3">s3</core:case>
</core:switch>

<h5>Just text</h5>
<core:switch value="s3">
	Just text
</core:switch>