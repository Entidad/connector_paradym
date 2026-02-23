# Work in Progress

- Widgets updated to React mode ready widgets (DataGrid2, QR)
- API updates
    - Projects
        - Add attributes openId4VcVersion, verificationDataAccess
        - Change input parameter API_Projects_POST_v1, Project_Create from projectName (string) to ProjectApi [breaking]
        - Add POST update project
        - Rename Project_Create to Project_ProcessCreateUpdate [breaking]
    - Profiles/default
        - Add attributes openId4VcVersion
        - Rename attributes AndroidApplicationId to androidBundleId and appleApplicationId to appleAppId [breaking]
    - Authorization Servers
        - Add methods 
            GET retrieve authorization servers
            POST create authorization server
            GET retrieve authorization server
            PUT update authorization server
            DELETE delete authorization server
    - Attribute Providers
        - Add methods 
            GET retrieve attribute providers
            POST create attribute provider
            GET retrieve attribute provider
            PUT update attribute provider
            DELETE delete attribute provider


# Release version 4.0.0

- Upgrade to Mendix 10.24.13
- Configurable verification data retention affected how verification data is retrieved. Connector assumes default Webhook option didcomm.verification.data (Paradym change log November 27, 2025)
- OpenID4VC request authentication with X509 certificates (Paradym change log June 25, 2025)
