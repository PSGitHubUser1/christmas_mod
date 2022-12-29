name: Bug Report
title: "[Bugfix]: "
labels: ["bug"]
body:
  - type: input
    id: description
    attributes:
  - type: textarea
    id: what-happened
    attributes:
      label: What happened?
      placeholder: Tell us what you see!
      value: 
    validations:
      required: true
  - type: dropdown
    id: version
    attributes:
      options:
        - Fabric API version:
        - Fabric Loader version:
        - Mod version:
    validations:
      required: true
  - type: textarea
    id: logs
    attributes:
      render: shell
  - type: checkboxes
    id: terms
    attributes:
      options:
        - label: No issue has been posted here related to this bug
        - label: There is no solution on Internet/YouTube
        - lebel: I've tried this many times [at least 3]
          required: true
