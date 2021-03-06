from rest_framework import serializers
from .models import *

from django.contrib.auth import authenticate, get_user_model
from djoser.conf import settings
from djoser.serializers import TokenCreateSerializer

User = get_user_model()

class CustomTokenCreateSerializer(TokenCreateSerializer):

    def validate(self, attrs):
        password = attrs.get("password")
        params = {settings.LOGIN_FIELD: attrs.get(settings.LOGIN_FIELD)}
        self.user = authenticate(
            request=self.context.get("request"), **params, password=password
        )
        if not self.user:
            self.user = User.objects.filter(**params).first()
            if self.user and not self.user.check_password(password):
                self.fail("invalid_credentials")
        # We changed only below line
        if self.user: # and self.user.is_active: 
            return attrs
        self.fail("invalid_credentials")


class CargosSerializer(serializers.ModelSerializer):
    class Meta:
        model = Cargos
        fields = [
            'id',            
            'nome',            
            'nivelAcesso',            
        ]


class AmbientesSerializer(serializers.ModelSerializer):
    class Meta:
        model = Ambientes
        fields = [
            'id',            
            'nome',            
        ]


class UsuariosSerializer(serializers.ModelSerializer):
    class Meta:
        model = Usuarios
        fields = [
            'id',
            'nome',
            'email',
            'fone',
            'ativo',
            'idNivelAcessoFK',
            'image'
        ]


class TarefasSerializer(serializers.ModelSerializer):
    class Meta:
        model = Tarefas
        fields = [
            'id',
            'nome',
            'descricao',
            'idSolicitanteFK',            
            'idResponsavelFK',            
            'idAmbienteFK',
            'idStatus',
            'prazo',
            'dataInicio',
            'dataFim',
        ]


class FotosSerializer(serializers.ModelSerializer):
    class Meta:
        model = Fotos
        fields = [
            'id',
            'nome',
            'idTarefaFK',
            'idStatus',
            'image',
        ]


