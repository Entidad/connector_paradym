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
    Request Body: defaultLocale added (optional), localization added (optional), openId4VcVersion added (optional)
    Response: defaultLocale added, localization added, openId4VcVersion added, openId4VciRedirectUri added
    Response: did removed

### TO DO
POST /v1/projects/{projectId}/templates/credentials/mdoc
    Request Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
    Response: attributeProviderId added, authorization added, localization added

GET /v1/projects/{projectId}/templates/credentials/mdoc/{credentialTemplateId}
    Response: attributeProviderId added, authorization added, localization added

PUT /v1/projects/{projectId}/templates/credentials/mdoc/{credentialTemplateId}
    Request Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
    Response: attributeProviderId added, authorization added, localization added

POST /v1/projects/{projectId}/templates/credentials/sd-jwt-vc
    Request Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
    Response: attributeProviderId added, authorization added, localization added

GET /v1/projects/{projectId}/templates/credentials/sd-jwt-vc/{credentialTemplateId}
    Response: attributeProviderId added, authorization added, localization added

PUT /v1/projects/{projectId}/templates/credentials/sd-jwt-vc/{credentialTemplateId}
    Body: attributeProviderId added (optional), authorization added (optional), localization added (optional)
    Response: attributeProviderId added, authorization added, localization added

Check
    attributes AndroidApplicationId to androidBundleId and appleApplicationId to appleAppId [breaking]

## Mendix

- Widgets updated to React mode ready widgets (replaced DataGrid with DataGrid2, QR Code with QR)
- Rename Project_Create to Project_ProcessCreateUpdate [breaking]
- Change input parameter API_Projects_POST_v1, Project_Create from projectName (string) to ProjectApi [breaking]
- Rename entity VerifierApi to IssuerVerifierApi [breaking]


# Release version 4.0.0

- Upgrade to Mendix 10.24.13
- Configurable verification data retention affected how verification data is retrieved. Connector assumes default Webhook option didcomm.verification.data (Paradym change log November 27, 2025)
- OpenID4VC request authentication with X509 certificates (Paradym change log June 25, 2025)
