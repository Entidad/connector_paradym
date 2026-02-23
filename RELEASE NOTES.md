# Work in Progress
## New Resources & Methods

POST /v1/projects/{projectId}

GET, POST /v1/projects/{projectId}/attribute-providers
GET, PUT, DELETE /v1/projects/{projectId}/attribute-providers/{attributeProviderId}

GET, POST /v1/projects/{projectId}/authorization-servers
GET, PUT, DELETE /v1/projects/{projectId}/authorization-servers/{authorizationServerId}

GET, POST /v1/projects/{projectId}/certificates/csrs
DELETE /v1/projects/{projectId}/certificates/csrs/{certificateSigningRequestId}
POST /v1/projects/{projectId}/certificates/csrs/{certificateSigningRequestId}/import
POST /v1/projects/{projectId}/certificates/{certificateId}/deactivate

## Changes Existing Resources & Methods

GET /v1/projects/{projectId}/certificates

Params: filter[parentCertificateId] added (optional)
Params: sort enum extended with parentCertificateId and -parentCertificateId

POST /v1/projects/{projectId}/certificates

Response: capabilities added, parentCertificateId added

POST /v1/projects/{projectId}/certificates/{certificateId}/activate

Response: capabilities added, parentCertificateId added

POST /v1/projects/{projectId}/certificates/{certificateId}/revoke

Response: capabilities added, parentCertificateId added


GET /v1/projects/{projectId}/profiles/default

Response: defaultLocale added, localization added, openId4VcVersion added, openId4VciRedirectUri added
Response: did removed

PUT /v1/projects/{projectId}/profiles/default

Body: defaultLocale added (optional), localization added (optional), openId4VcVersion added (optional)
Response: defaultLocale added, localization added, openId4VcVersion added, openId4VciRedirectUri added
Response: did removed


POST /v1/projects/{projectId}/templates/credentials/mdoc

Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
Response: attributeProviderId added, authorization added, localization added

GET /v1/projects/{projectId}/templates/credentials/mdoc/{credentialTemplateId}

Response: attributeProviderId added, authorization added, localization added

PUT /v1/projects/{projectId}/templates/credentials/mdoc/{credentialTemplateId}

Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
Response: attributeProviderId added, authorization added, localization added


POST /v1/projects/{projectId}/templates/credentials/sd-jwt-vc

Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
Response: attributeProviderId added, authorization added, localization added

GET /v1/projects/{projectId}/templates/credentials/sd-jwt-vc/{credentialTemplateId}

Response: attributeProviderId added, authorization added, localization added

PUT /v1/projects/{projectId}/templates/credentials/sd-jwt-vc/{credentialTemplateId}

Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
Response: attributeProviderId added, authorization added, localization added

## Mendix
- Widgets updated to React mode ready widgets (DataGrid2, QR)
- Rename Project_Create to Project_ProcessCreateUpdate



# Release version 4.0.0

- Upgrade to Mendix 10.24.13
- Configurable verification data retention affected how verification data is retrieved. Connector assumes default Webhook option didcomm.verification.data (Paradym change log November 27, 2025)
- OpenID4VC request authentication with X509 certificates (Paradym change log June 25, 2025)
