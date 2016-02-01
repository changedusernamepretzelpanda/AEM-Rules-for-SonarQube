package com.cognifide.aemrules.util;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ConstantsChecker {

	private static final Map<String, String> CONSTANTS;

	private static final Map<String, String> ANNOTATION_CONSTANTS;

	static {
		CONSTANTS = ImmutableMap.<String, String>builder()

				// interface com.day.cq.commons.jcr.JcrConstants
				.put("jcr:autoCreated", "interface com.day.cq.commons.jcr.JcrConstants.JCR_AUTOCREATED")
				.put("jcr:baseVersion", "interface com.day.cq.commons.jcr.JcrConstants.JCR_BASEVERSION")
				.put("jcr:child", "interface com.day.cq.commons.jcr.JcrConstants.JCR_CHILD")
				.put("jcr:childNodeDefinition", "interface com.day.cq.commons.jcr.JcrConstants.JCR_CHILDNODEDEFINITION")
				.put("jcr:content", "interface com.day.cq.commons.jcr.JcrConstants.JCR_CONTENT")
				.put("jcr:data", "interface com.day.cq.commons.jcr.JcrConstants.JCR_DATA")
				.put("jcr:defaultPrimaryType", "interface com.day.cq.commons.jcr.JcrConstants.JCR_DEFAULTPRIMARYTYPE")
				.put("jcr:defaultValues", "interface com.day.cq.commons.jcr.JcrConstants.JCR_DEFAULTVALUES")
				.put("jcr:encoding", "interface com.day.cq.commons.jcr.JcrConstants.JCR_ENCODING")
				.put("jcr:frozenMixinTypes", "interface com.day.cq.commons.jcr.JcrConstants.JCR_FROZENMIXINTYPES")
				.put("jcr:frozenNode", "interface com.day.cq.commons.jcr.JcrConstants.JCR_FROZENNODE")
				.put("jcr:frozenPrimaryType", "interface com.day.cq.commons.jcr.JcrConstants.JCR_FROZENPRIMARYTYPE")
				.put("jcr:frozenUuid", "interface com.day.cq.commons.jcr.JcrConstants.JCR_FROZENUUID")
				.put("jcr:hasOrderableChildNodes", "interface com.day.cq.commons.jcr.JcrConstants.JCR_HASORDERABLECHILDNODES")
				.put("jcr:isCheckedOut", "interface com.day.cq.commons.jcr.JcrConstants.JCR_ISCHECKEDOUT")
				.put("jcr:isMixin", "interface com.day.cq.commons.jcr.JcrConstants.JCR_ISMIXIN")
				.put("jcr:language", "interface com.day.cq.commons.jcr.JcrConstants.JCR_LANGUAGE")
				.put("jcr:lockIsDeep", "interface com.day.cq.commons.jcr.JcrConstants.JCR_LOCKISDEEP")
				.put("jcr:lockOwner", "interface com.day.cq.commons.jcr.JcrConstants.JCR_LOCKOWNER")
				.put("jcr:mandatory", "interface com.day.cq.commons.jcr.JcrConstants.JCR_MANDATORY")
				.put("jcr:mergeFailed", "interface com.day.cq.commons.jcr.JcrConstants.JCR_MERGEFAILED")
				.put("jcr:mimeType", "interface com.day.cq.commons.jcr.JcrConstants.JCR_MIMETYPE")
				.put("jcr:mixinTypes", "interface com.day.cq.commons.jcr.JcrConstants.JCR_MIXINTYPES")
				.put("jcr:multiple", "interface com.day.cq.commons.jcr.JcrConstants.JCR_MULTIPLE")
				.put("jcr:name", "interface com.day.cq.commons.jcr.JcrConstants.JCR_NAME")
				.put("jcr:nodeTypeName", "interface com.day.cq.commons.jcr.JcrConstants.JCR_NODETYPENAME")
				.put("jcr:onParentVersion", "interface com.day.cq.commons.jcr.JcrConstants.JCR_ONPARENTVERSION")
				.put("jcr:predecessors", "interface com.day.cq.commons.jcr.JcrConstants.JCR_PREDECESSORS")
				.put("jcr:primaryItemName", "interface com.day.cq.commons.jcr.JcrConstants.JCR_PRIMARYITEMNAME")
				.put("jcr:primaryType", "interface com.day.cq.commons.jcr.JcrConstants.JCR_PRIMARYTYPE")
				.put("jcr:propertyDefinition", "interface com.day.cq.commons.jcr.JcrConstants.JCR_PROPERTYDEFINITION")
				.put("jcr:protected", "interface com.day.cq.commons.jcr.JcrConstants.JCR_PROTECTED")
				.put("jcr:requiredPrimaryTypes", "interface com.day.cq.commons.jcr.JcrConstants.JCR_REQUIREDPRIMARYTYPES")
				.put("jcr:requiredType", "interface com.day.cq.commons.jcr.JcrConstants.JCR_REQUIREDTYPE")
				.put("jcr:rootVersion", "interface com.day.cq.commons.jcr.JcrConstants.JCR_ROOTVERSION")
				.put("jcr:sameNameSiblings", "interface com.day.cq.commons.jcr.JcrConstants.JCR_SAMENAMESIBLINGS")
				.put("jcr:statement", "interface com.day.cq.commons.jcr.JcrConstants.JCR_STATEMENT")
				.put("jcr:successors", "interface com.day.cq.commons.jcr.JcrConstants.JCR_SUCCESSORS")
				.put("jcr:supertypes", "interface com.day.cq.commons.jcr.JcrConstants.JCR_SUPERTYPES")
				.put("jcr:system", "interface com.day.cq.commons.jcr.JcrConstants.JCR_SYSTEM")
				.put("jcr:uuid", "interface com.day.cq.commons.jcr.JcrConstants.JCR_UUID")
				.put("jcr:valueConstraints", "interface com.day.cq.commons.jcr.JcrConstants.JCR_VALUECONSTRAINTS")
				.put("jcr:versionHistory", "interface com.day.cq.commons.jcr.JcrConstants.JCR_VERSIONHISTORY")
				.put("jcr:versionLabels", "interface com.day.cq.commons.jcr.JcrConstants.JCR_VERSIONLABELS")
				.put("jcr:versionStorage", "interface com.day.cq.commons.jcr.JcrConstants.JCR_VERSIONSTORAGE")
				.put("jcr:versionableUuid", "interface com.day.cq.commons.jcr.JcrConstants.JCR_VERSIONABLEUUID")
				.put("jcr:path", "interface com.day.cq.commons.jcr.JcrConstants.JCR_PATH")
				.put("jcr:score", "interface com.day.cq.commons.jcr.JcrConstants.JCR_SCORE")
				.put("mix:lockable", "interface com.day.cq.commons.jcr.JcrConstants.MIX_LOCKABLE")
				.put("mix:referenceable", "interface com.day.cq.commons.jcr.JcrConstants.MIX_REFERENCEABLE")
				.put("mix:versionable", "interface com.day.cq.commons.jcr.JcrConstants.MIX_VERSIONABLE")
				.put("nt:base", "interface com.day.cq.commons.jcr.JcrConstants.NT_BASE")
				.put("nt:childNodeDefinition", "interface com.day.cq.commons.jcr.JcrConstants.NT_CHILDNODEDEFINITION")
				.put("nt:file", "interface com.day.cq.commons.jcr.JcrConstants.NT_FILE")
				.put("nt:folder", "interface com.day.cq.commons.jcr.JcrConstants.NT_FOLDER")
				.put("nt:frozenNode", "interface com.day.cq.commons.jcr.JcrConstants.NT_FROZENNODE")
				.put("nt:hierarchyNode", "interface com.day.cq.commons.jcr.JcrConstants.NT_HIERARCHYNODE")
				.put("nt:linkedFile", "interface com.day.cq.commons.jcr.JcrConstants.NT_LINKEDFILE")
				.put("nt:nodeType", "interface com.day.cq.commons.jcr.JcrConstants.NT_NODETYPE")
				.put("nt:propertyDefinition", "interface com.day.cq.commons.jcr.JcrConstants.NT_PROPERTYDEFINITION")
				.put("nt:query", "interface com.day.cq.commons.jcr.JcrConstants.NT_QUERY")
				.put("nt:resource", "interface com.day.cq.commons.jcr.JcrConstants.NT_RESOURCE")
				.put("nt:unstructured", "interface com.day.cq.commons.jcr.JcrConstants.NT_UNSTRUCTURED")
				.put("nt:version", "interface com.day.cq.commons.jcr.JcrConstants.NT_VERSION")
				.put("nt:versionHistory", "interface com.day.cq.commons.jcr.JcrConstants.NT_VERSIONHISTORY")
				.put("nt:versionLabels", "interface com.day.cq.commons.jcr.JcrConstants.NT_VERSIONLABELS")
				.put("nt:versionedChild", "interface com.day.cq.commons.jcr.JcrConstants.NT_VERSIONEDCHILD")
				.put("jcr:title", "interface com.day.cq.commons.jcr.JcrConstants.JCR_TITLE")
				.put("mix:title", "interface com.day.cq.commons.jcr.JcrConstants.MIX_TITLE")
				.put("mix:created", "interface com.day.cq.commons.jcr.JcrConstants.MIX_CREATED")
				.put("mix:lastModified", "interface com.day.cq.commons.jcr.JcrConstants.MIX_LAST_MODIFIED")

				// interface com.day.cq.dam.api.DamConstants
				.put("dam:Asset", "interface com.day.cq.dam.api.DamConstants.NT_DAM_ASSET")
				.put("dam:AssetContent", "interface com.day.cq.dam.api.DamConstants.NT_DAM_ASSETCONTENT")
				.put("dam:extracted", "interface com.day.cq.dam.api.DamConstants.PN_EXTRACTED")
				.put("dam:sha1", "interface com.day.cq.dam.api.DamConstants.PN_SHA1")
				.put("dam:size", "interface com.day.cq.dam.api.DamConstants.DAM_SIZE")
				.put("cq:versionCreator", "interface com.day.cq.dam.api.DamConstants.PN_VERSION_CREATOR")
				.put("dc:contributor", "interface com.day.cq.dam.api.DamConstants.DC_CONTRIBUTOR")
				.put("dc:coverage", "interface com.day.cq.dam.api.DamConstants.DC_COVERAGE")
				.put("dc:creator", "interface com.day.cq.dam.api.DamConstants.DC_CREATOR")
				.put("dc:date", "interface com.day.cq.dam.api.DamConstants.DC_DATE")
				.put("dc:description", "interface com.day.cq.dam.api.DamConstants.DC_DESCRIPTION")
				.put("dc:extent", "interface com.day.cq.dam.api.DamConstants.DC_EXTENT")
				.put("dc:format", "interface com.day.cq.dam.api.DamConstants.DC_FORMAT")
				.put("dc:identifier", "interface com.day.cq.dam.api.DamConstants.DC_IDENTIFIER")
				.put("dc:language", "interface com.day.cq.dam.api.DamConstants.DC_LANGUAGE")
				.put("dc:modified", "interface com.day.cq.dam.api.DamConstants.DC_MODIFIED")
				.put("dc:publisher", "interface com.day.cq.dam.api.DamConstants.DC_PUBLISHER")
				.put("dc:relation", "interface com.day.cq.dam.api.DamConstants.DC_RELATION")
				.put("dc:rights", "interface com.day.cq.dam.api.DamConstants.DC_RIGHTS")
				.put("dc:subject", "interface com.day.cq.dam.api.DamConstants.DC_SUBJECT")
				.put("dc:title", "interface com.day.cq.dam.api.DamConstants.DC_TITLE")
				.put("dc:type", "interface com.day.cq.dam.api.DamConstants.DC_TYPE")
				.put("cq5dam.thumbnail", "interface com.day.cq.dam.api.DamConstants.PREFIX_ASSET_THUMBNAIL")
				.put("exif:PixelXDimension", "interface com.day.cq.dam.api.DamConstants.EXIF_PIXELXDIMENSION")
				.put("exif:PixelYDimension", "interface com.day.cq.dam.api.DamConstants.EXIF_PIXELYDIMENSION")
				.put("tiff:ImageLength", "interface com.day.cq.dam.api.DamConstants.TIFF_IMAGELENGTH")
				.put("tiff:ImageWidth", "interface com.day.cq.dam.api.DamConstants.TIFF_IMAGEWIDTH")
				.put("assetExpired", "interface com.day.cq.dam.api.DamConstants.ACTIVITY_TYPE_ASSET_EXPIRED")
				.put("assetExpiring", "interface com.day.cq.dam.api.DamConstants.ACTIVITY_TYPE_ASSET_EXPIRING")
				.put("dam:lastPostExpirationRun", "interface com.day.cq.dam.api.DamConstants.LAST_EXPIRY_NOTIFICATION_PROPNAME")
				.put("dam/collection", "interface com.day.cq.dam.api.DamConstants.COLLECTION_SLING_RES_TYPE")
				.put("dam/smartcollection", "interface com.day.cq.dam.api.DamConstants.SMART_COLLECTION_SLING_RES_TYPE")
				.put("dam/content/schemaeditors/forms", "interface com.day.cq.dam.api.DamConstants.SCHEMA_EDITOR_FORMS_BASE_DIR")
				.put("processingProfile", "interface com.day.cq.dam.api.DamConstants.PROCESSING_PROFILE")
				.put("metadataProfile", "interface com.day.cq.dam.api.DamConstants.METADATA_PROFILE")
				.put("videoProfile", "interface com.day.cq.dam.api.DamConstants.VIDEO_PROFILE")
				.put("imageProfile", "interface com.day.cq.dam.api.DamConstants.IMAGE_PROFILE")
				.put("folderThumbnail", "interface com.day.cq.dam.api.DamConstants.THUMBNAIL_NODE")
				.put("downloadUrl", "interface com.day.cq.dam.api.DamConstants.DOWNLOAD_URL")

				// interface com.day.cq.wcm.api.NameConstants
				.put("cq:Page", "interface com.day.cq.wcm.api.NameConstants.NT_PAGE")
				.put("cq:PseudoPage", "interface com.day.cq.wcm.api.NameConstants.NT_PSEUDO_PAGE")
				.put("cq:Template", "interface com.day.cq.wcm.api.NameConstants.NT_TEMPLATE")
				.put("cq:Component", "interface com.day.cq.wcm.api.NameConstants.NT_COMPONENT")
				.put("cq:EditConfig", "interface com.day.cq.wcm.api.NameConstants.NT_EDIT_CONFIG")
				.put("dialog", "interface com.day.cq.wcm.api.NameConstants.NN_DIALOG")
				.put("dialogPath", "interface com.day.cq.wcm.api.NameConstants.PN_DIALOG_PATH")
				.put("design_dialog", "interface com.day.cq.wcm.api.NameConstants.NN_DESIGN_DIALOG")
				.put("designDialogPath", "interface com.day.cq.wcm.api.NameConstants.PN_DESIGN_DIALOG_PATH")
				.put("cq:editConfig", "interface com.day.cq.wcm.api.NameConstants.NN_EDIT_CONFIG")
				.put("cq:childEditConfig", "interface com.day.cq.wcm.api.NameConstants.NN_CHILD_EDIT_CONFIG")
				.put("icon.png", "interface com.day.cq.wcm.api.NameConstants.NN_ICON_PNG")
				.put("thumbnail.png", "interface com.day.cq.wcm.api.NameConstants.NN_THUMBNAIL_PNG")
				.put("cq:cellName", "interface com.day.cq.wcm.api.NameConstants.PN_CELL_NAME")
				.put("cq:isContainer", "interface com.day.cq.wcm.api.NameConstants.PN_IS_CONTAINER")
				.put("cq:noDecoration", "interface com.day.cq.wcm.api.NameConstants.PN_NO_DECORATION")
				.put("cq:htmlTag", "interface com.day.cq.wcm.api.NameConstants.NN_HTML_TAG")
				.put("allowedPaths", "interface com.day.cq.wcm.api.NameConstants.PN_ALLOWED_PATHS")
				.put("allowedChildren", "interface com.day.cq.wcm.api.NameConstants.PN_ALLOWED_CHILDREN")
				.put("allowedParents", "interface com.day.cq.wcm.api.NameConstants.PN_ALLOWED_PARENTS")
				.put("componentGroup", "interface com.day.cq.wcm.api.NameConstants.PN_COMPONENT_GROUP")
				.put("sitePath", "interface com.day.cq.wcm.api.NameConstants.PN_SITE_PATH")
				.put("cq:templatePath", "interface com.day.cq.wcm.api.NameConstants.PN_TEMPLATE_PATH")
				.put("cq:template", "interface com.day.cq.wcm.api.NameConstants.NN_TEMPLATE")
				.put("cq:tagName", "interface com.day.cq.wcm.api.NameConstants.PN_TAG_NAME")
				.put("cq:infoProviders", "interface com.day.cq.wcm.api.NameConstants.NN_INFO_PROVIDERS")
				.put("className", "interface com.day.cq.wcm.api.NameConstants.PN_CLASS_NAME")
				.put("cq:disableTargeting", "interface com.day.cq.wcm.api.NameConstants.PN_DISABLE_TARGETING")
				.put("cq:layout", "interface com.day.cq.wcm.api.NameConstants.PN_LAYOUT")
				.put("cq:dialogMode", "interface com.day.cq.wcm.api.NameConstants.PN_DIALOG_MODE")
				.put("cq:inplaceEditing", "interface com.day.cq.wcm.api.NameConstants.NN_INPLACE_EDITING")
				.put("cq:emptyText", "interface com.day.cq.wcm.api.NameConstants.PN_EMPTY_TEXT")
				.put("cq:actions", "interface com.day.cq.wcm.api.NameConstants.PN_ACTIONS")
				.put("cq:actionConfigs", "interface com.day.cq.wcm.api.NameConstants.NN_ACTION_CONFIGS")
				.put("cq:formParameters", "interface com.day.cq.wcm.api.NameConstants.NN_FORM_PARAMETERS")
				.put("cq:dropTargets", "interface com.day.cq.wcm.api.NameConstants.NN_DROP_TARGETS")
				.put("cq:listeners", "interface com.day.cq.wcm.api.NameConstants.NN_LISTENERS")
				.put("propertyName", "interface com.day.cq.wcm.api.NameConstants.PN_DT_NAME")
				.put("cq:inherit", "interface com.day.cq.wcm.api.NameConstants.PN_INHERIT")
				.put("cq:designPath", "interface com.day.cq.wcm.api.NameConstants.PN_DESIGN_PATH")
				.put("cq:parentPath", "interface com.day.cq.wcm.api.NameConstants.PN_PARENT_PATH")
				.put("cq:childrenOrder", "interface com.day.cq.wcm.api.NameConstants.PN_CHILDREN_ORDER")
				.put("cq:siblingOrder", "interface com.day.cq.wcm.api.NameConstants.PN_SIBLING_ORDER")
				.put("cq:versionComment", "interface com.day.cq.wcm.api.NameConstants.PN_VERSION_COMMENT")
				.put("onTime", "interface com.day.cq.wcm.api.NameConstants.PN_ON_TIME")
				.put("offTime", "interface com.day.cq.wcm.api.NameConstants.PN_OFF_TIME")
				.put("cq:lastModified", "interface com.day.cq.wcm.api.NameConstants.PN_PAGE_LAST_MOD")
				.put("cq:lastModifiedBy", "interface com.day.cq.wcm.api.NameConstants.PN_PAGE_LAST_MOD_BY")
				.put("cq:defaultView", "interface com.day.cq.wcm.api.NameConstants.PN_DEFAULT_VIEW")
				.put("sling:vanityPath", "interface com.day.cq.wcm.api.NameConstants.PN_SLING_VANITY_PATH")
				.put("cq:allowedTemplates", "interface com.day.cq.wcm.api.NameConstants.PN_ALLOWED_TEMPLATES")

				// interface com.day.cq.wcm.webservicesupport.ConfigurationConstants
				.put("cq/cloudserviceconfigs/components/servicepage", "interface com.day.cq.wcm.webservicesupport.ConfigurationConstants.RT_SERVICE")
				.put("cq/cloudserviceconfigs/components/configpage", "interface com.day.cq.wcm.webservicesupport.ConfigurationConstants.RT_CONFIGURATION")
				.put("cq:cloudserviceconfigs", "interface com.day.cq.wcm.webservicesupport.ConfigurationConstants.PN_CONFIGURATIONS")

				// class org.apache.sling.jcr.resource.JcrResourceConstants
				.put("http://sling.apache.org/jcr/sling/1.0", "class org.apache.sling.jcr.resource.JcrResourceConstants.SLING_NAMESPACE_URI")
				.put("sling:resourceType", "class org.apache.sling.jcr.resource.JcrResourceConstants.SLING_RESOURCE_TYPE_PROPERTY")
				.put("sling:resourceSuperType", "class org.apache.sling.jcr.resource.JcrResourceConstants.SLING_RESOURCE_SUPER_TYPE_PROPERTY")
				.put("user.jcr.credentials", "class org.apache.sling.jcr.resource.JcrResourceConstants.AUTHENTICATION_INFO_CREDENTIALS")
				.put("user.jcr.workspace", "class org.apache.sling.jcr.resource.JcrResourceConstants.AUTHENTICATION_INFO_WORKSPACE")
				.put("user.jcr.session", "class org.apache.sling.jcr.resource.JcrResourceConstants.AUTHENTICATION_INFO_SESSION")
				.put("sling:Folder", "class org.apache.sling.jcr.resource.JcrResourceConstants.NT_SLING_FOLDER")
				.put("sling:OrderedFolder", "class org.apache.sling.jcr.resource.JcrResourceConstants.NT_SLING_ORDERED_FOLDER")

				// interface com.day.cq.tagging.TagConstants
				.put("cq:Tag", "interface com.day.cq.tagging.TagConstants.NT_TAG")
				.put("cq:Taggable", "interface com.day.cq.tagging.TagConstants.NT_TAGGABLE")
				.put("cq:movedTo", "interface com.day.cq.tagging.TagConstants.PN_MOVED_TO")
				.put("cq:backlinks", "interface com.day.cq.tagging.TagConstants.PN_BACKLINKS")

				// interface com.day.cq.replication.ReplicationStatus
				.put("cq:ReplicationStatus", "interface com.day.cq.replication.ReplicationStatus.NODE_TYPE")

				// interface org.apache.jackrabbit.vault.packaging.JcrPackage
				.put("application/zip", "interface org.apache.jackrabbit.vault.packaging.JcrPackage.MIME_TYPE")
				.put("vlt:definition", "interface org.apache.jackrabbit.vault.packaging.JcrPackage.NN_VLT_DEFINITION")
				.put("vlt:Package", "interface org.apache.jackrabbit.vault.packaging.JcrPackage.NT_VLT_PACKAGE")
				.put("vlt:PackageDefinition", "interface org.apache.jackrabbit.vault.packaging.JcrPackage.NT_VLT_PACKAGE_DEFINITION")

				// interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition
				.put("acHandling", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_AC_HANDLING")
				.put("buildCount", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_BUILD_COUNT")
				.put("cndPattern", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_CND_PATTERN")
				.put("dependencies", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_DEPENDENCIES")
				.put("noIntermediateSaves", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_DISABLE_INTERMEDIATE_SAVE")
				.put("lastUnpacked", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LAST_UNPACKED")
				.put("lastUnpackedBy", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LAST_UNPACKED_BY")
				.put("lastUnwrapped", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LAST_UNWRAPPED")
				.put("lastUnwrappedBy", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LAST_UNWRAPPED_BY")
				.put("lastWrapped", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LAST_WRAPPED")
				.put("lastWrappedBy", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LAST_WRAPPED_BY")
				.put("requiresRestart", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_REQUIRES_RESTART")
				.put("requiresRoot", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_REQUIRES_ROOT")
				.put("subPackages", "interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_SUB_PACKAGES")

				// interface org.apache.sling.api.resource.ResourceResolverFactory
				.put("user.password", "interface org.apache.sling.api.resource.ResourceResolverFactory.PASSWORD")
				.put("sling.service.subservice", "interface org.apache.sling.api.resource.ResourceResolverFactory.SUBSERVICE")
				.put("user.name", "interface org.apache.sling.api.resource.ResourceResolverFactory.USER")
				.put("user.impersonation", "interface org.apache.sling.api.resource.ResourceResolverFactory.USER_IMPERSONATION")

				// class com.adobe.granite.workflow.event.WorkflowEvent
				.put("Delagatee", "class com.adobe.granite.workflow.event.WorkflowEvent.DELEGATEE")
				.put("EventType", "class com.adobe.granite.workflow.event.WorkflowEvent.EVENT_TYPE")
				.put("fromNodeName", "class com.adobe.granite.workflow.event.WorkflowEvent.FROM_NODE_NAME")
				.put("JobFailed", "class com.adobe.granite.workflow.event.WorkflowEvent.JOB_FAILED_EVENT")
				.put("ModelDeleted", "class com.adobe.granite.workflow.event.WorkflowEvent.MODEL_DELETED_EVENT")
				.put("ModelDeployed", "class com.adobe.granite.workflow.event.WorkflowEvent.MODEL_DEPLOYED_EVENT")
				.put("NodeTransition", "class com.adobe.granite.workflow.event.WorkflowEvent.NODE_TRANSITION_EVENT")
				.put("ParentWorkflowId", "class com.adobe.granite.workflow.event.WorkflowEvent.PARENT_WORKFLOW_ID")
				.put("ProcessTimeout", "class com.adobe.granite.workflow.event.WorkflowEvent.PROCESS_TIMEOUT_EVENT")
				.put("ResourceCollectionModified", "class com.adobe.granite.workflow.event.WorkflowEvent.RESOURCE_COLLECTION_MODIFIED")
				.put("TimeStamp", "class com.adobe.granite.workflow.event.WorkflowEvent.TIME_STAMP")
				.put("toNodeName", "class com.adobe.granite.workflow.event.WorkflowEvent.TO_NODE_NAME")
				.put("User", "class com.adobe.granite.workflow.event.WorkflowEvent.USER")
				.put("VariableName", "class com.adobe.granite.workflow.event.WorkflowEvent.VARIABLE_NAME")
				.put("VariableUpdate", "class com.adobe.granite.workflow.event.WorkflowEvent.VARIABLE_UPDATE_EVENT")
				.put("VariableValue", "class com.adobe.granite.workflow.event.WorkflowEvent.VARIABLE_VALUE")
				.put("Workdata", "class com.adobe.granite.workflow.event.WorkflowEvent.WORK_DATA")
				.put("Workitem", "class com.adobe.granite.workflow.event.WorkflowEvent.WORK_ITEM")
				.put("WorkflowAborted", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_ABORTED_EVENT")
				.put("WorkflowCompleted", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_COMPLETED_EVENT")
				.put("WorkflowInstanceId", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_INSTANCE_ID")
				.put("WorkflowName", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_NAME")
				.put("WorkflowNode", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_NODE")
				.put("WorkflowResumed", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_RESUMED_EVENT")
				.put("WorkflowStarted", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_STARTED_EVENT")
				.put("WorkflowSuspended", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_SUSPENDED_EVENT")
				.put("WorkflowVersion", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKFLOW_VERSION")
				.put("WorkItemDelegated", "class com.adobe.granite.workflow.event.WorkflowEvent.WORKITEM_DELEGATION_EVENT")

				// mix
				.put("cq:lastReplicated",
					"interface com.day.cq.replication.ReplicationStatus.NODE_PROPERTY_LAST_REPLICATED"
						+ " or interface com.day.cq.wcm.api.NameConstants.PN_PAGE_LAST_REPLICATED")
				.put("cq:lastReplicatedBy",
					"interface com.day.cq.replication.ReplicationStatus.NODE_PROPERTY_LAST_REPLICATED_BY"
						+ " or interface com.day.cq.wcm.api.NameConstants.PN_PAGE_LAST_REPLICATED_BY")
				.put("cq:lastReplicationAction",
					"interface com.day.cq.replication.ReplicationStatus.NODE_PROPERTY_LAST_REPLICATION_ACTION"
						+ " or interface com.day.cq.wcm.api.NameConstants.PN_PAGE_LAST_REPLICATION_ACTION")
				.put("cq:tags", "interface com.day.cq.tagging.TagConstants.PN_TAGS or interface com.day.cq.wcm.api.NameConstants.PN_TAGS")
				.put("cq:name", "interface com.day.cq.dam.api.DamConstants.PN_NAME or interface com.day.cq.wcm.api.NameConstants.PN_NAME")
				.put("jcr:created",
					"interface com.day.cq.commons.jcr.JcrConstants.JCR_CREATED"
						+ " or interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_CREATED")
				.put("jcr:createdBy",
					"interface com.day.cq.commons.jcr.JcrConstants.JCR_CREATED_BY"
						+ " or interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_CREATED_BY")
				.put("jcr:description",
					"interface com.day.cq.commons.jcr.JcrConstants.JCR_DESCRIPTION"
						+ " or interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_DESCRIPTION")
				.put("jcr:lastModified",
					"interface com.day.cq.commons.jcr.JcrConstants.JCR_LASTMODIFIED"
						+ " or interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LASTMODIFIED")
				.put("jcr:lastModifiedBy", "interface com.day.cq.commons.jcr.JcrConstants.JCR_LAST_MODIFIED_BY"
					+ " or interface org.apache.jackrabbit.vault.packaging.JcrPackageDefinition.PN_LASTMODIFIED_BY")
				.build();

		ANNOTATION_CONSTANTS = ImmutableMap.<String, String>builder()

				// class org.apache.sling.api.SlingConstants
				.put("org.apache.sling.api.include.servlet", "class org.apache.sling.api.SlingConstants.ATTR_REQUEST_SERVLET")
				.put("org.apache.sling.api.include.resource", "class org.apache.sling.api.SlingConstants.ATTR_REQUEST_CONTENT")
				.put("org.apache.sling.api.include.request_path_info", "class org.apache.sling.api.SlingConstants.ATTR_REQUEST_PATH_INFO")
				.put("javax.servlet.include.request_uri", "class org.apache.sling.api.SlingConstants.ATTR_INCLUDE_REQUEST_URI")
				.put("javax.servlet.include.context_path", "class org.apache.sling.api.SlingConstants.ATTR_INCLUDE_CONTEXT_PATH")
				.put("javax.servlet.include.servlet_path", "class org.apache.sling.api.SlingConstants.ATTR_INCLUDE_SERVLET_PATH")
				.put("javax.servlet.include.path_info", "class org.apache.sling.api.SlingConstants.ATTR_INCLUDE_PATH_INFO")
				.put("javax.servlet.include.query_string", "class org.apache.sling.api.SlingConstants.ATTR_INCLUDE_QUERY_STRING")
				.put("javax.servlet.error.exception", "class org.apache.sling.api.SlingConstants.ERROR_EXCEPTION")
				.put("javax.servlet.error.exception_type", "class org.apache.sling.api.SlingConstants.ERROR_EXCEPTION_TYPE")
				.put("javax.servlet.error.message", "class org.apache.sling.api.SlingConstants.ERROR_MESSAGE")
				.put("javax.servlet.error.request_uri", "class org.apache.sling.api.SlingConstants.ERROR_REQUEST_URI")
				.put("javax.servlet.error.servlet_name", "class org.apache.sling.api.SlingConstants.ERROR_SERVLET_NAME")
				.put("javax.servlet.error.status_code", "class org.apache.sling.api.SlingConstants.ERROR_STATUS")
				.put("org/apache/sling/api/resource/Resource/ADDED", "class org.apache.sling.api.SlingConstants.TOPIC_RESOURCE_ADDED")
				.put("org/apache/sling/api/resource/Resource/REMOVED", "class org.apache.sling.api.SlingConstants.TOPIC_RESOURCE_REMOVED")
				.put("org/apache/sling/api/resource/Resource/CHANGED", "class org.apache.sling.api.SlingConstants.TOPIC_RESOURCE_CHANGED")
				.put("org/apache/sling/api/resource/ResourceProvider/ADDED", "class org.apache.sling.api.SlingConstants.TOPIC_RESOURCE_PROVIDER_ADDED")
				.put("org/apache/sling/api/resource/ResourceProvider/REMOVED", "class org.apache.sling.api.SlingConstants.TOPIC_RESOURCE_PROVIDER_REMOVED")
				.put("org/apache/sling/api/resource/ResourceResolverMapping/CHANGED", "class org.apache.sling.api.SlingConstants.TOPIC_RESOURCE_RESOLVER_MAPPING_CHANGED")
				.put("path", "class org.apache.sling.api.SlingConstants.PROPERTY_PATH")
				.put("userid", "class org.apache.sling.api.SlingConstants.PROPERTY_USERID")
				.put("resourceType", "class org.apache.sling.api.SlingConstants.PROPERTY_RESOURCE_TYPE")
				.put("resourceSuperType", "class org.apache.sling.api.SlingConstants.PROPERTY_RESOURCE_SUPER_TYPE")
				.put("resourceChangedAttributes", "class org.apache.sling.api.SlingConstants.PROPERTY_CHANGED_ATTRIBUTES")
				.put("resourceAddedAttributes", "class org.apache.sling.api.SlingConstants.PROPERTY_ADDED_ATTRIBUTES")
				.put("resourceRemovedAttributes", "class org.apache.sling.api.SlingConstants.PROPERTY_REMOVED_ATTRIBUTES")
				.put("org/apache/sling/api/adapter/AdapterFactory/ADDED", "class org.apache.sling.api.SlingConstants.TOPIC_ADAPTER_FACTORY_ADDED")
				.put("org/apache/sling/api/adapter/AdapterFactory/REMOVED", "class org.apache.sling.api.SlingConstants.TOPIC_ADAPTER_FACTORY_REMOVED")
				.put("adaptables", "class org.apache.sling.api.SlingConstants.PROPERTY_ADAPTABLE_CLASSES")
				.put("adapters", "class org.apache.sling.api.SlingConstants.PROPERTY_ADAPTER_CLASSES")
				.put("sling.core.current.servletName", "class org.apache.sling.api.SlingConstants.SLING_CURRENT_SERVLET_NAME")

				// class org.apache.sling.api.servlets.HttpConstants
				.put("OPTIONS", "class org.apache.sling.api.servlets.HttpConstants.METHOD_OPTIONS")
				.put("GET", "class org.apache.sling.api.servlets.HttpConstants.METHOD_GET")
				.put("HEAD", "class org.apache.sling.api.servlets.HttpConstants.METHOD_HEAD")
				.put("POST", "class org.apache.sling.api.servlets.HttpConstants.METHOD_POST")
				.put("PUT", "class org.apache.sling.api.servlets.HttpConstants.METHOD_PUT")
				.put("DELETE", "class org.apache.sling.api.servlets.HttpConstants.METHOD_DELETE")
				.put("TRACE", "class org.apache.sling.api.servlets.HttpConstants.METHOD_TRACE")
				.put("CONNECT", "class org.apache.sling.api.servlets.HttpConstants.METHOD_CONNECT")
				.put("Accept", "class org.apache.sling.api.servlets.HttpConstants.HEADER_ACCEPT")
				.put("ETag", "class org.apache.sling.api.servlets.HttpConstants.HEADER_ETAG")
				.put("If-Match", "class org.apache.sling.api.servlets.HttpConstants.HEADER_IF_MATCH")
				.put("If-Modified-Since", "class org.apache.sling.api.servlets.HttpConstants.HEADER_IF_MODIFIED_SINCE")
				.put("Last-Modified", "class org.apache.sling.api.servlets.HttpConstants.HEADER_LAST_MODIFIED")

				// interface org.osgi.framework.Constants
				.put("System Bundle", "interface org.osgi.framework.Constants.SYSTEM_BUNDLE_LOCATION")
				.put("system.bundle", "interface org.osgi.framework.Constants.SYSTEM_BUNDLE_SYMBOLICNAME")
				.put("Bundle-Category", "interface org.osgi.framework.Constants.BUNDLE_CATEGORY")
				.put("Bundle-ClassPath", "interface org.osgi.framework.Constants.BUNDLE_CLASSPATH")
				.put("Bundle-Copyright", "interface org.osgi.framework.Constants.BUNDLE_COPYRIGHT")
				.put("Bundle-Description", "interface org.osgi.framework.Constants.BUNDLE_DESCRIPTION")
				.put("Bundle-Name", "interface org.osgi.framework.Constants.BUNDLE_NAME")
				.put("Bundle-NativeCode", "interface org.osgi.framework.Constants.BUNDLE_NATIVECODE")
				.put("Export-Package", "interface org.osgi.framework.Constants.EXPORT_PACKAGE")
				.put("Export-Service", "interface org.osgi.framework.Constants.EXPORT_SERVICE")
				.put("Import-Package", "interface org.osgi.framework.Constants.IMPORT_PACKAGE")
				.put("DynamicImport-Package", "interface org.osgi.framework.Constants.DYNAMICIMPORT_PACKAGE")
				.put("Import-Service", "interface org.osgi.framework.Constants.IMPORT_SERVICE")
				.put("Bundle-Vendor", "interface org.osgi.framework.Constants.BUNDLE_VENDOR")
				.put("Bundle-Version", "interface org.osgi.framework.Constants.BUNDLE_VERSION")
				.put("Bundle-DocURL", "interface org.osgi.framework.Constants.BUNDLE_DOCURL")
				.put("Bundle-ContactAddress", "interface org.osgi.framework.Constants.BUNDLE_CONTACTADDRESS")
				.put("Bundle-Activator", "interface org.osgi.framework.Constants.BUNDLE_ACTIVATOR")
				.put("Bundle-UpdateLocation", "interface org.osgi.framework.Constants.BUNDLE_UPDATELOCATION")
				.put("specification-version", "interface org.osgi.framework.Constants.PACKAGE_SPECIFICATION_VERSION")
				.put("processor", "interface org.osgi.framework.Constants.BUNDLE_NATIVECODE_PROCESSOR")
				.put("osname", "interface org.osgi.framework.Constants.BUNDLE_NATIVECODE_OSNAME")
				.put("osversion", "interface org.osgi.framework.Constants.BUNDLE_NATIVECODE_OSVERSION")
				.put("language", "interface org.osgi.framework.Constants.BUNDLE_NATIVECODE_LANGUAGE")
				.put("Bundle-RequiredExecutionEnvironment", "interface org.osgi.framework.Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT")
				.put("Bundle-SymbolicName", "interface org.osgi.framework.Constants.BUNDLE_SYMBOLICNAME")
				.put("singleton", "interface org.osgi.framework.Constants.SINGLETON_DIRECTIVE")
				.put("fragment-attachment", "interface org.osgi.framework.Constants.FRAGMENT_ATTACHMENT_DIRECTIVE")
				.put("always", "interface org.osgi.framework.Constants.FRAGMENT_ATTACHMENT_ALWAYS")
				.put("resolve-time", "interface org.osgi.framework.Constants.FRAGMENT_ATTACHMENT_RESOLVETIME")
				.put("never", "interface org.osgi.framework.Constants.FRAGMENT_ATTACHMENT_NEVER")
				.put("Bundle-Localization", "interface org.osgi.framework.Constants.BUNDLE_LOCALIZATION")
				.put("OSGI-INF/l10n/bundle", "interface org.osgi.framework.Constants.BUNDLE_LOCALIZATION_DEFAULT_BASENAME")
				.put("Require-Bundle", "interface org.osgi.framework.Constants.REQUIRE_BUNDLE")
				.put("bundle-version", "interface org.osgi.framework.Constants.BUNDLE_VERSION_ATTRIBUTE")
				.put("Fragment-Host", "interface org.osgi.framework.Constants.FRAGMENT_HOST")
				.put("selection-filter", "interface org.osgi.framework.Constants.SELECTION_FILTER_ATTRIBUTE")
				.put("Bundle-ManifestVersion", "interface org.osgi.framework.Constants.BUNDLE_MANIFESTVERSION")
				.put("version", "interface org.osgi.framework.Constants.VERSION_ATTRIBUTE")
				.put("bundle-symbolic-name", "interface org.osgi.framework.Constants.BUNDLE_SYMBOLICNAME_ATTRIBUTE")
				.put("resolution", "interface org.osgi.framework.Constants.RESOLUTION_DIRECTIVE")
				.put("optional", "interface org.osgi.framework.Constants.RESOLUTION_OPTIONAL")
				.put("uses", "interface org.osgi.framework.Constants.USES_DIRECTIVE")
				.put("include", "interface org.osgi.framework.Constants.INCLUDE_DIRECTIVE")
				.put("exclude", "interface org.osgi.framework.Constants.EXCLUDE_DIRECTIVE")
				.put("mandatory", "interface org.osgi.framework.Constants.MANDATORY_DIRECTIVE")
				.put("visibility", "interface org.osgi.framework.Constants.VISIBILITY_DIRECTIVE")
				.put("private", "interface org.osgi.framework.Constants.VISIBILITY_PRIVATE")
				.put("reexport", "interface org.osgi.framework.Constants.VISIBILITY_REEXPORT")
				.put("extension", "interface org.osgi.framework.Constants.EXTENSION_DIRECTIVE")
				.put("framework", "interface org.osgi.framework.Constants.EXTENSION_FRAMEWORK")
				.put("bootclasspath", "interface org.osgi.framework.Constants.EXTENSION_BOOTCLASSPATH")
				.put("Bundle-ActivationPolicy", "interface org.osgi.framework.Constants.BUNDLE_ACTIVATIONPOLICY")
				.put("lazy", "interface org.osgi.framework.Constants.ACTIVATION_LAZY")
				.put("org.osgi.framework.version", "interface org.osgi.framework.Constants.FRAMEWORK_VERSION")
				.put("org.osgi.framework.vendor", "interface org.osgi.framework.Constants.FRAMEWORK_VENDOR")
				.put("org.osgi.framework.language", "interface org.osgi.framework.Constants.FRAMEWORK_LANGUAGE")
				.put("org.osgi.framework.os.name", "interface org.osgi.framework.Constants.FRAMEWORK_OS_NAME")
				.put("org.osgi.framework.os.version", "interface org.osgi.framework.Constants.FRAMEWORK_OS_VERSION")
				.put("org.osgi.framework.processor", "interface org.osgi.framework.Constants.FRAMEWORK_PROCESSOR")
				.put("org.osgi.framework.executionenvironment", "interface org.osgi.framework.Constants.FRAMEWORK_EXECUTIONENVIRONMENT")
				.put("org.osgi.framework.bootdelegation", "interface org.osgi.framework.Constants.FRAMEWORK_BOOTDELEGATION")
				.put("org.osgi.framework.system.packages", "interface org.osgi.framework.Constants.FRAMEWORK_SYSTEMPACKAGES")
				.put("org.osgi.framework.system.packages.extra", "interface org.osgi.framework.Constants.FRAMEWORK_SYSTEMPACKAGES_EXTRA")
				.put("org.osgi.supports.framework.extension", "interface org.osgi.framework.Constants.SUPPORTS_FRAMEWORK_EXTENSION")
				.put("org.osgi.supports.bootclasspath.extension", "interface org.osgi.framework.Constants.SUPPORTS_BOOTCLASSPATH_EXTENSION")
				.put("org.osgi.supports.framework.fragment", "interface org.osgi.framework.Constants.SUPPORTS_FRAMEWORK_FRAGMENT")
				.put("org.osgi.supports.framework.requirebundle", "interface org.osgi.framework.Constants.SUPPORTS_FRAMEWORK_REQUIREBUNDLE")
				.put("org.osgi.framework.security", "interface org.osgi.framework.Constants.FRAMEWORK_SECURITY")
				.put("osgi", "interface org.osgi.framework.Constants.FRAMEWORK_SECURITY_OSGI")
				.put("org.osgi.framework.storage", "interface org.osgi.framework.Constants.FRAMEWORK_STORAGE")
				.put("org.osgi.framework.storage.clean", "interface org.osgi.framework.Constants.FRAMEWORK_STORAGE_CLEAN")
				.put("onFirstInit", "interface org.osgi.framework.Constants.FRAMEWORK_STORAGE_CLEAN_ONFIRSTINIT")
				.put("org.osgi.framework.library.extensions", "interface org.osgi.framework.Constants.FRAMEWORK_LIBRARY_EXTENSIONS")
				.put("org.osgi.framework.command.execpermission", "interface org.osgi.framework.Constants.FRAMEWORK_EXECPERMISSION")
				.put("org.osgi.framework.trust.repositories", "interface org.osgi.framework.Constants.FRAMEWORK_TRUST_REPOSITORIES")
				.put("org.osgi.framework.windowsystem", "interface org.osgi.framework.Constants.FRAMEWORK_WINDOWSYSTEM")
				.put("org.osgi.framework.startlevel.beginning", "interface org.osgi.framework.Constants.FRAMEWORK_BEGINNING_STARTLEVEL")
				.put("org.osgi.framework.bundle.parent", "interface org.osgi.framework.Constants.FRAMEWORK_BUNDLE_PARENT")
				.put("service.id", "interface org.osgi.framework.Constants.SERVICE_ID")
				.put("service.pid", "interface org.osgi.framework.Constants.SERVICE_PID")
				.put("service.ranking", "interface org.osgi.framework.Constants.SERVICE_RANKING")
				.put("service.vendor", "interface org.osgi.framework.Constants.SERVICE_VENDOR")
				.put("service.description", "interface org.osgi.framework.Constants.SERVICE_DESCRIPTION")

				// class org.apache.sling.engine.EngineConstants
				.put("javax.servlet.Filter", "class org.apache.sling.engine.EngineConstants.FILTER_NAME")
				.put("sling.filter.scope", "class org.apache.sling.engine.EngineConstants.SLING_FILTER_SCOPE")
				.put("COMPONENT", "class org.apache.sling.engine.EngineConstants.FILTER_SCOPE_COMPONENT")
				.put("ERROR", "class org.apache.sling.engine.EngineConstants.FILTER_SCOPE_ERROR")
				.put("INCLUDE", "class org.apache.sling.engine.EngineConstants.FILTER_SCOPE_INCLUDE")
				.put("FORWARD", "class org.apache.sling.engine.EngineConstants.FILTER_SCOPE_FORWARD")
				.put("REQUEST", "class org.apache.sling.engine.EngineConstants.FILTER_SCOPE_REQUEST")

				// class com.adobe.granite.workflow.event.WorkflowEvent
				.put("com/adobe/granite/workflow/event", "class com.adobe.granite.workflow.event.WorkflowEvent.EVENT_TOPIC")

				.build();
	}

	private ConstantsChecker() {
		// empty
	}

	public static boolean isAnnotationConstant(String value) {
		return ANNOTATION_CONSTANTS.containsKey(value);
	}

	public static String getAnnotationConstantFieldName(String value) {
		return ANNOTATION_CONSTANTS.get(value);
	}

	public static String getConstantFieldName(String value) {
		return CONSTANTS.get(value);
	}

	public static boolean isConstant(String value) {
		return CONSTANTS.containsKey(value);
	}

}